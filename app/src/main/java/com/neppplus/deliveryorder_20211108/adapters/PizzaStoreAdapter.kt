package com.neppplus.deliveryorder_20211108.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.deliveryorder_20211108.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>) : ArrayAdapter<StoreData>(mContext, resId, mList) {



}