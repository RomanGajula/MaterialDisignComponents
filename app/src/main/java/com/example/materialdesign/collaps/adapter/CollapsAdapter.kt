package com.example.materialdesign.collaps.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.materialdesign.collaps.reposirory.CollapsRepository
import com.example.materialdesign.databinding.ListItemBinding

class CollapsAdapter : RecyclerView.Adapter<CollapsAdapter.CollapsViewHolder>() {

    inner class CollapsViewHolder(val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollapsViewHolder {
        val itemsView = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CollapsViewHolder(itemsView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CollapsViewHolder, position: Int) {
        val materialDesignComponent = CollapsRepository.names[position]

        holder.binding.nameMaterialDesignComponent.text = materialDesignComponent.name
    }

    override fun getItemCount(): Int {
        return CollapsRepository.names.size
    }
}