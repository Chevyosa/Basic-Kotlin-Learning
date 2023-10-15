fun main(){
    println("Belajar Kotlin di Intellij Idea")
    //Komentar didalam Kotlin

    /*
    Ada juga komentar multi line, penggunaan nya seperti ini
     */

    //Belajar Menggunakan Val
    val nama = "Riyan"
    println("Halo Saya "+ nama) //tanda + untuk meletakkan di print atau println agar bisa menambah identifier
    println(if (true) "Always True" else "Always False")

    /*
    Output seharusnya:
    Halo saya
    Riyan
    ALways True
     */

    //Belajar val
    val nama2 = "Sutri"
    val kampus = "USU"
    println(nama2 +" "+ kampus)

    val nilaiawal: Int = 30
    val nilaikedua: Int = 10
    println(nilaiawal / nilaikedua)

    //hotkey langsung copy line adalah ctrl+d

    //Belajar char
    var vocal = 'A'
    println("Vocal "+ vocal++)
    println("Vocal "+ vocal++)
    println("Vocal "+ vocal--)
    println("Vocal "+ vocal--)
    println("Vocal "+ vocal--)

    /*
    Operasi increment dan decrement sendiri merupakan operasi yang bisa kita gunakan pada tipe data Number.
    Lalu kenapa kita bisa menggunakannya pada tipe Char? Karena pada dasarnya setiap Characters merupakan representasi dari Unicode.
    Contoh Unicode A adalah 0041. Ketika kita melakukan increment maka hasilnya adalah 0042 yang mana merupakan Unicode dari B.
     */

    //Belajar String
    val teks = "Kampus"
    val charawal = teks[0]
    println("Huruf awal dari $teks adalah $charawal") //Output nya harusnya Huruf awal dari Kampus adalah K
    for (char in teks){
        print("$char") //Output nya seharusnya K a m p u s
    }

    /*penggunaan $ untuk memanggil identifier langsung
    tanpa harus menutup tanda kutip
     */

    val statement = "Kotlin is mantap"
    val statement2 = "Kotlin is \"mantap\""

    /*
    Selain \” di atas, terdapat beberapa karakter lain yang dapat digunakan untuk melakukan escaped di dalam sebuah String, antara lain:

    \t: menambah tab ke dalam teks.

    \n: membuat baris baru di dalam teks.

    \’: menambah karakter single quote kedalam teks.

    \”: menambah karakter double quote kedalam teks.

    \\: menambah karakter backslash kedalam teks.
     */


}
