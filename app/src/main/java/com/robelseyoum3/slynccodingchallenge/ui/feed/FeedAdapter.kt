package com.robelseyoum3.slynccodingchallenge.ui.feed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.robelseyoum3.slynccodingchallenge.R
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Post
import de.hdodenhof.circleimageview.CircleImageView

class FeedAdapter(private val requestManager: RequestManager) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var list = mutableListOf<Post>()

    var data: List<Post>
        get() = list.toList()
        set(value) {
            list.clear()
            list.addAll(value)
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            type_text_and_image_post -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feed_text_image_item, parent, false)
                FeedTextAndImageViewHolder(view, requestManager)
            }
            else -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feed_text_item, parent, false)
                FeedTextItemViewHolder(view, requestManager)
            }
        }
    }

    override fun getItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int {

        if (list[position].photoUrl.isNotEmpty()) {
            return type_text_and_image_post
        }

        return type_text_post
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is FeedTextItemViewHolder -> holder.updateView(list[position])
            is FeedTextAndImageViewHolder -> holder.updateView(list[position])
        }
    }

    class FeedTextItemViewHolder(itemView: View, private val requestManager: RequestManager) :
        RecyclerView.ViewHolder(itemView) {

        fun updateView(post: Post) {
            val profile = itemView.findViewById<CircleImageView>(R.id.profileImage)
            val name = itemView.findViewById<TextView>(R.id.name)
            val textContent = itemView.findViewById<TextView>(R.id.textContent)

            post.organisation.let {
                name.text = it.name
                requestManager
                    .load(it.logoUrl)
                    .into(profile)
            }

            if(post.boosted){
                itemView.findViewById<TextView>(R.id.boosted).visibility = View.VISIBLE
            } else {
                itemView.findViewById<TextView>(R.id.boosted).visibility = View.GONE
            }

            post.content.let {
                textContent.text = it
            }
        }
    }

    class FeedTextAndImageViewHolder(itemView: View, private  val requestManager: RequestManager) : RecyclerView.ViewHolder(itemView) {
        fun updateView(post: Post) {
            val profile = itemView.findViewById<CircleImageView>(R.id.profileImage)
            val postImage = itemView.findViewById<ImageView>(R.id.postImage)
            val name = itemView.findViewById<TextView>(R.id.name)
            val textContent = itemView.findViewById<TextView>(R.id.textContent)

            post.photoUrl.let {
                requestManager
                    .load(it)
                    .into(postImage)
            }

            post.organisation.let {
                name.text = it.name
                requestManager
                    .load(it.logoUrl)
                    .into(profile)
            }

            post.content.let {
                textContent.text = it
            }

            if(post.boosted){
                itemView.findViewById<TextView>(R.id.boosted).visibility = View.VISIBLE
            } else {
                itemView.findViewById<TextView>(R.id.boosted).visibility = View.GONE
            }
        }
    }

    companion object {
        const val type_text_post = 0
        const val type_text_and_image_post = 1
    }

}