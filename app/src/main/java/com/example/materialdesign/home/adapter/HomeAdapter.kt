package com.example.materialdesign.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.materialdesign.databinding.ListItemBinding
import com.example.materialdesign.home.repository.HomeRepository
import com.example.materialdesign.home.viewmodel.HomeViewModel

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {

    val homeViewModel = HomeViewModel()

    inner class MyViewHolder(val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val view = binding.root
            binding.containerMaterialDesignComponent.setOnClickListener {
                homeViewModel.checkClickMaterialDesignComponent(
                    binding.nameMaterialDesignComponent.text.toString(),
                    view
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemsView = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(itemsView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind()
        val materialDesignComponent = HomeRepository.materialDesignComponent[position]

        holder.binding.nameMaterialDesignComponent.text = materialDesignComponent.name

    }

    override fun getItemCount(): Int {
        return HomeRepository.materialDesignComponent.size
    }

}