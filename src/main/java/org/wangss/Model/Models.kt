package org.wangss.Model

/**
 * Created by zll on 2017/5/24.
 */

//table dt_ci
data class Ci(val id: Int, val title: String, val author: String, val content: String) {
}
//table dt_common_user  普通用户
data class CommonUser(val id: Int, val username: String, val password: String, val online: Boolean) {
}