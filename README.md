# Belajar Spring Boot Security dan Oauth2 #

### Authorization Server ###

Endpoints :

* Otorisasi / mendapatkan token :  http://localhost:10000/oauth/authorize?client_id=aplikasiwebsample&response_type=code&redirect_uri=http://example.com
* Menukar access code dengan access token : http://localhost:10000/oauth/token
* Mengecek validitas dan informasi token : http://localhost:10000/oauth/check_token

