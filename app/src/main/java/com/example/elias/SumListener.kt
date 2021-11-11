package com.example.elias

class SumListener private constructor() {
    var listener: OnSummed? = null

    interface OnSummed{
        fun sum(total: Int)
    }

    companion object{
        private var instance: SumListener? = null
        @JvmStatic
        fun getInstance(): SumListener{
            if (instance == null){
                instance = SumListener()
            }
            return instance!!
        }
    }
}