package com.akirachix.my_post_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.my_post_app.databinding.CommentsListItemBinding


class CommentsAdapter(var commentsList: List<Comments>): RecyclerView.Adapter<CommentsAdapter.CommentsViewHolder>() {    override fun onCreateViewHolder(        parent: ViewGroup,        viewType: Int    ): CommentsViewHolder {        val binding = CommentsListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return CommentsViewHolder(binding)
}

    
    override fun getItemCount(): Int = commentsList.size

    override fun onBindViewHolder(holder: CommentsViewHolder, position: Int) {
        val comment = commentsList[position]
        holder.binding.tvName.text = comment.name
        holder.binding.tvComment.text = comment.body
    }

    class CommentsViewHolder(val binding: CommentsListItemBinding):RecyclerView.ViewHolder(binding.root){

    }



}