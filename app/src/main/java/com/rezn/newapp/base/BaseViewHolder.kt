package com.rezn.newapp.base


import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * Sets view to ViewHolder and binding object to local variable.
 *
 * @param binding - exemplar of Data Binding class.
 */

/**
 * Provide access to binding class for child classes.
 *
 * @return - exemplar of Data Binding.
 */

abstract class BaseViewHolder<T : ViewDataBinding, P>(protected val binding: T) : RecyclerView.ViewHolder(binding.root)
{

    /**
     * Method for binding data to the view.
     *
     * @param data - exemplar of data class.
     */
    abstract fun bind(data: P, position: Int)


}