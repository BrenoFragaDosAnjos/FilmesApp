﻿<h1 align="center">Filmes App</h1>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=31"><img src="https://img.shields.io/badge/API-31%2B-brightgreen.svg?style=flat" border="0" alt="API"></a>
  <br>
  <a href="https://wa.me/+5511977538727"><img alt="WhatsApp" src="https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white"/></a>
  <a href="https://www.linkedin.com/in/breno-fraga-4904a318b/"><img alt="Linkedin" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/></a>
  <a href="mailto:breno.anjos.bf@gmail.com"><img alt="Gmail" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>
</p>
<p align="center">  
⭐ Esse é um projeto para demonstrar meu conhecimento técnico no desenvolvimento Android nativo com Kotlin. Mais informações técnicas abaixo.</br>

🎥 Aplicativo que mostra uma listagem das filmes provenientes de uma API pública, com sistema de descrição aprimorada de filmes.
</p>
</br>

<p float="left" align="center">
  <img alt="screenshot" width="30%" src="screenshots/Screenshot_20230406_191838.png"/>
  <img alt="screenshot" width="30%" src="screenshots/Screenshot_20230406_191904.png"/>
  <img alt="screenshot" width="30%" src="screenshots/Screenshot_20230406_191915.png"/>
</p>

Faça o download da <a href="https://github.com/BrenoFragaDosAnjos/FilmesApp/blob/main/apk/app-debug.apk?raw=true">APK diretamente</a>. Você pode ver <a href="https://www.google.com/search?q=como+instalar+um+apk+no+android">aqui</a> como instalar uma APK no seu aparelho android.

- Minimum SDK level: 31
- [Linguagem Kotlin](https://kotlinlang.org/)

- Jetpack
    - Lifecycle: Observe os ciclos de vida do Android e manipule os estados da interface do usuário após as alterações do ciclo de vida.
    - ViewModel: Gerencia o detentor de dados relacionados à interface do usuário e o ciclo de vida. Permite que os dados sobrevivam a alterações de configuração, como rotações de tela.
    - ViewBinding: Liga os componentes do XML no Kotlin através de uma classe que garante segurança de tipo e outras vantagens.
    - RecyclerView: É projetado para exibir listas grandes de dados em um layout de rolagem eficiente.

- Arquitetura
    - MVVM (View - ViewModel - Model)
    - Comunicação da ViewModel com a View através de LiveData
    - Repositories para abstração da comunidação com a camada de dados.

- Bibliotecas
    - [Retrofit2 & OkHttp3](https://github.com/square/retrofit): Para realizar requisições seguindo o padrão HTTP.
    - [Glide](https://github.com/bumptech/glide): Para carregamento de imagens e cacheamento das mesmas.

## Arquitetura
**Filmes App** utiliza a arquitetura MVVM e o padrão de Repositories, que segue as [recomendações oficiais do Google](https://developer.android.com/topic/architecture).
</br></br>
<p float="left" align="center">
  <img alt="screenshot" src="screenshots/Screenshot_1.png"/>
</p>
<br>

## API de terceiros

FilmesApp utiliza a [TMDB Api](https://www.themoviedb.org/documentation/api) para suas chamadas</br>
A TMBD Api disponibiliza gratuitamente uma API REST completa com a listagem de filmes e outras funcionalidades.

## Features

<img src="screenshots/gif1.gif" width="25%"/>
Funcionamento do App desde a abertura da splash screen,reenderização da lista dinâmica de filmes do App, até a abertura de uma nova tela com a descrição do filme. Lembrando que o carregamento das imagens é feito de forma dinâmica através da web. Layout de card criado com CardView e ConstraintLayout e lista utilizando RecyclerView.

# Licença

```xml
   Copyright [2023] [Breno Fraga dos Anjos]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
