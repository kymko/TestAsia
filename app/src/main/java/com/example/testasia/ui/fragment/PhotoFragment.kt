package com.example.testasia.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.testasia.R
import com.example.testasia.databinding.FragmentCameraBinding
import com.example.testasia.databinding.FragmentPhotoBinding
import com.example.testasia.mvp.model.Photos
import com.example.testasia.mvp.presenter.PhotoPresenter

class PhotoFragment : Fragment() {

    private var _binding: FragmentPhotoBinding? = null
    private val binding: FragmentPhotoBinding get() = _binding!!
    private val photoAdapter: PhotoAdapter = PhotoAdapter()

//    @InjectPresenter
//    lateinit var photoPresenter: PhotoPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhotoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        photoPresenter.photoDao.getAllPic().observe(viewLifecycleOwner, { response ->

//            photoAdapter.addPhoto(response as ArrayList<Photos>)


//        })

        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = photoAdapter
        }

        binding.btnCamera.setOnClickListener {
            findNavController().navigate(R.id.action_photoFragment_to_cameraFragment)
        }
    }

}