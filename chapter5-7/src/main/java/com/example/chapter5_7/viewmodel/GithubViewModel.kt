package com.example.chapter5_7.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.chapter5_7.Service.GithubService
import com.example.chapter5_7.model.Repo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

// 단계 6: @HiltViewModel 어노테이션을 지정합니다.
// 단계 7: 생성자에 @Inject를 붙여줍시다.
@HiltViewModel
class GithubViewModel @Inject constructor(
    private val githubService: GithubService
) : ViewModel() {
    val repos = mutableStateListOf<Repo>()

    fun getRepos() {
        repos.clear()
        viewModelScope.launch {
            val result = githubService.listRepos("d-abing")
            repos.addAll(result)
        }
    }
}