package com.example.testasia.ui.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testasia.databinding.PhotoListBinding
import com.example.testasia.mvp.model.Photos

class PhotoAdapter : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    private lateinit var binding: PhotoListBinding
    private var list: ArrayList<Photos> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = PhotoListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun addPhoto(photos: ArrayList<Photos>) {
        list.addAll(photos)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding: PhotoListBinding = PhotoListBinding.bind(itemView)

        fun onBind(photos: Photos) {
            Glide.with(itemView.context).load(photos.photo).into(binding.ivAvatar)
        }

    }

}