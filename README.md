Buatlah automation test framework dan simpan kodenya sebagai repository di GitHub. Automation test framework harus mengandung beberapa aspek yang di ikuti, antara lain :

Buatlah test untuk Web UI dan API didalam satu repository
Test case untuk Web dan API harus menggunakan Gherkin format, gunakan Cucumber sebagai library untuk implementasinya
Buatlah folder atau package terpisah pada Java Code, Step Definitions dan Feature untuk masing-masing jenis test (Web dan API)
Buatlah 2 Gradle Task untuk menjalankan fungsi berikut
            Execute semua cucumber test yang memiliki tag @api
           Execute semua cucumber test yang memiliki tag @web
  5.Buatlah report menggunakan Cucumber untuk format HTML dan       JSON

  6.Buatlah GitHub Actions workflow untuk menjalankan test yang     sudah dibuat dengan cara (event) manual trigger dan setiap kali ada   Pull Request

 7.Jangan lupa tambahkan README file dan berikian setiap informasi   penting dari repository kalian, seperti tools dan library yang digunakan,   dan bagaimana cara menjalankan test nya



Note:

Untuk Web UI Test gunakan website berikut sebagai target dan pembuatan test scenario: https://www.demoblaze.com/

Untuk API test, gunakan public API berikut:

https://dummyapi.io/docs/user (Get User by ID, Create User, Update User, Delete User)

https://dummyapi.io/docs/tag (Get List of Tags)

Build With
Proyek pengujian otomatis melibatkan enam buah library yang dibutuhkan:
cucumber framework
selenium framework
webdriver manager
rest assure
testng
assertion (tambahan)

Reference
Daftar resource yang dapat dipelajari:
Selenium documentation
Cucumber documentation
TestNg documentation
Tutorial Gradle Instalasi
Gradle Tutotrial
Testng Documentation
