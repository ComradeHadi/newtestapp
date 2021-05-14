package com.hadi.vieaura_camer_app.presentation

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hadi.core.data.PicsTag
import java.text.SimpleDateFormat
import java.util.*

class PicsTagsListAdapter(var PicsTags: ArrayList<PicsTag>): RecyclerView.Adapter<PicsTagsListAdapter.PicsTagViewHolder>() {

    fun updatePicsTags(newPicsTags: List<PicsTag>) {
        PicsTags.clear()
        PicsTags.addAll(newPicsTags)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PicsTagViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_PicsTag, parent, false)
    )

    override fun getItemCount() = PicsTags.size

    override fun onBindViewHolder(holder: PicsTagViewHolder, position: Int) {
        holder.bind(PicsTags[position])
    }

    inner class PicsTagViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val layout = view.PicsTagLayout
        private val PicsTagTitle = view.title
        private val PicsTagContent = view.content
        private val PicsTagDate = view.date
        private val PicsTagWords = view.wordCount

        fun bind(PicsTag: PicsTag) {
            PicsTagTitle.text = PicsTag.title
            PicsTagContent.text = PicsTag.content

            val sdf = SimpleDateFormat("MMM dd, HH:mm:ss")
            val resultDate = Date(PicsTag.updateTime)
            PicsTagDate.text = "Last updated: ${sdf.format(resultDate)}"


        }
    }
}
