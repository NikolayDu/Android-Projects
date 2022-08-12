package com.example.pictures

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*

class ListViewAdapter
    (private val context: Context,
     private val ListViewArrayList: ArrayList<ListView_model>) : BaseAdapter() {

    override fun getViewTypeCount(): Int{
         return count
     }
    override fun getItemViewType(position: Int): Int {
        return position
    }
    override fun getCount(): Int{
        return ListViewArrayList.size
    }
    override fun getItem(position: Int): Any {
        return ListViewArrayList[position]
    }
    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, itemView: View?, parent: ViewGroup): View {
        var itemView: View? = itemView
        val holder: ViewHolder

        if (itemView == null) {
            holder = ViewHolder()
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            itemView = inflater.inflate(R.layout.list_view_model, null, true)

            holder.name = itemView!!.findViewById(R.id.name) as TextView
            holder.iv = itemView.findViewById(R.id.imgView) as ImageView

            itemView.tag = holder
        } else {
            holder = itemView.tag as ViewHolder
        }

        holder.name!!.setText(ListViewArrayList[position].getNames())
        holder.iv!!.setImageResource(ListViewArrayList[position].getImage())


        return itemView
    }

    private inner class ViewHolder {
        var name: TextView? = null
        internal var iv: ImageView? = null
    }
}











































