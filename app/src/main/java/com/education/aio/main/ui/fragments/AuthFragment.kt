package com.education.aio.main.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.education.aio.R
import com.education.aio.main.core.Login.LoginContract


class AuthFragment : Fragment(), LoginContract.View {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onLoginSuccess(message: String?) {
        TODO("Not yet implemented")
    }

    override fun onLoginFailure(message: String?) {
        TODO("Not yet implemented")
    }


}