package cn.spacexc.weargit.dataclass.repo.commit.record


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tree(
    @SerialName("sha")
    val sha: String,
    @SerialName("url")
    val url: String
)