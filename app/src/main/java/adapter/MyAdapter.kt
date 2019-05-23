package adapter
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kotlindemo.R

//
//
//import android.content.Context
//import android.support.v7.widget.RecyclerView
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.example.kotlindemo.R
//
///**
// * Created by haibowen.
// * User: ekwing
// * Date: 2019-05-23
// * Time: 16:27
// * Function:
// */
//class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
//    lateinit var mContext: Context
//    lateinit var mDatas: List<String>
//    lateinit var mInflater: LayoutInflater
//    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
//
//    }
//    constructor(mContext: Context, mDatas: List<String>, mInflater: LayoutInflater) : super() {
//        this.mContext = mContext
//        this.mDatas = mDatas
//        this.mInflater = mInflater
//    }
//
//    override fun getItemCount(): Int {
//        if (mDatas.size > 0 && mDatas != null) {
//            return mDatas.size
//        }
//        return 0
//
//    }
//
//    override fun onBindViewHolder(p0: RecyclerViewAdapter.ViewHolder, p1: Int) {
//        //p0. = mDatas[p1]
//
//    }
//
//    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerViewAdapter.ViewHolder {
//
//        val itemView: View = mInflater.inflate(R.layout.layout_item, null)
//        val holder: ViewHolder = ViewHolder(itemView)
//        return holder
//    }
//
//}


class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder> {
    var mContext: Context
    var mDatas: List<String>
    var mInflater: LayoutInflater
    //这是构造方法
    constructor(context: Context, list: List<String>) {
        this.mContext = context
        this.mDatas = list
        mInflater = LayoutInflater.from(mContext)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView: View = mInflater.inflate(R.layout.layout_item, null)
        val holder: ViewHolder = ViewHolder(itemView)
        return holder
    }

    override fun getItemCount(): Int {
        if (mDatas.size > 0 && mDatas != null) {
            return mDatas.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = mDatas[position]
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var text: TextView = itemView.findViewById(R.id.text)
    }
}