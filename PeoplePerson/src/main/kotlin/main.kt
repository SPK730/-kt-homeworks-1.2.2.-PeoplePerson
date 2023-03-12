fun main() {
    var likes = 3

    println("Понравилось " + (likes) + " " + (peoplePersonChoice(likes)))

}

fun peoplePersonChoice(likes: Int): String {
    return when {
        (likes % 10) == 1 -> "человеку"
        (likes % 10) != 1 -> "людям"
        likes in (5..20) -> "человекам"
        else -> "(в-общем, никому не понравилось)"
    }
}


////fun peoplePersonChoice(likes: Int): String {
////    return when {
////        likes == 1 -> "человеку"
////        likes in (2..4) -> "людям"
////        likes in (5..20) -> "человекам"
////        likes > 20 && likes % 2 != 0 -> "человекам"
////        likes > 20 && likes % 2 == 0 -> "людям"
////        else -> "(в-общем, никому не понравилось)"
////    }
//
//}