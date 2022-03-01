package com.example.view.testnotekt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.view.testnotekt.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER



class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private var mfBinding: FragmentMainBinding?= null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentMainBinding.inflate(inflater,container,false)
        mfBinding=binding




        val recyclerView = mfBinding?.MainFragmentRecyclerViewView

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.getAll().observe(this.viewLifecycleOwner, Observer { diary->
            recyclerView?.adapter=MainDiaryAdaper(diary)
        })


//        val title = MainFragment_TextView_title
//        val content = MainFragment_TextView_content
//        viewModel.getAll().observe(viewLifecycleOwner, Observer{
//            title.text = it[it.size-1].title
//            context.text = it[it.size-1].content
//        })

        return mfBinding?.root

    }


}