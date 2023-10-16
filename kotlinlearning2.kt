//Belajar Function di Kotlin

//Contoh Function return nilai
fun setUser(nama: String, umur: Int): String{
    return "Nama kamu adalah $nama dan berumur $umur tahun"
}

fun matakuliah(matkul: String, Dosen: String): String{
    return "Matakuliah $matkul diajarkan oleh $Dosen"
}

//Contoh Function return Unit
fun kuliah(matkul: String, sks: Int){
    println("Hari ini masuk matakuliah $matkul dan total SKS $sks")
}

fun main(){
    //Contoh penggunaan function di main
    val user = setUser("Riyan", 19)
    println(user)

    val matkul = matakuliah("Daspro", "Bu Dian")
    println(matkul)

    val kuliah = kuliah("Mobile", 3)
    print(kuliah)

    //Contoh penggunaan if else
    val tokoBuka = 9
    val tokoTutup = 18
    val jamsekarang = 20
    val toko: String
    if(jamsekarang > tokoTutup){
        toko = "Maaf toko sudah tutup"
    }
    else{
        toko = "Toko Buka"
    }
    println(toko)
}