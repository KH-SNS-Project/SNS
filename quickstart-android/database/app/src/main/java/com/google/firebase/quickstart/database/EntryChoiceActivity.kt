package com.google.firebase.quickstart.database

import android.content.Intent
import com.firebase.example.internal.BaseEntryChoiceActivity
import com.firebase.example.internal.Choice

class EntryChoiceActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return listOf(
                Choice(
                        "맛집 SNS",
                        "하단에 OPEN 버튼을 누르면 회원가입 및 로그인이 진행됩니다.",
                        Intent(this, com.google.firebase.quickstart.database.java.SignInActivity::class.java))
        )
    }
}
