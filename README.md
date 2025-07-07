# 💱 Conversor de Moedas em Java

Este é um projeto simples de um **conversor de moedas** desenvolvido em **Java puro (sem frameworks)**. Ele utiliza a API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de câmbio em tempo real.

---

## 📌 Funcionalidades

- Conversão entre diferentes pares de moedas:
    - USD ↔ BRL (Dólar e Real)
    - USD ↔ EUR (Dólar e Euro)
    - USD ↔ ARS (Dólar e Peso Argentino)
- Entrada de valor e moedas pelo terminal
- Exibição do resultado formatado no console
- Armazenamento do histórico de conversões em um arquivo, exemplo `USDtoBRL.json`

---

## 🛠️ Tecnologias Utilizadas

- Java 21
- API HTTP nativa (`HttpClient`)
- Biblioteca **Gson** (para manipulação de JSON)

---

## 📦 Como Executar o Projeto

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/conversor-moedas-java.git
cd conversor-moedas-java
```

### 2. Compile o projeto
```bash
javac Main.java Converter.java Conversion.java ConversionHistory.java Menu.java RatesFilter.java
```

### 3. Execute a aplicação
```bash
java Main
```

---

## 🔑 Configuração da API

Esta aplicação utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) que exige uma chave de API (gratuita).

1. Crie uma conta no site.
2. Copie sua chave de API.
3. No código da classe `Conversor.java`, substitua a variável `apiKey`:

```java
var apiKey = "SUA_CHAVE_AQUI";
```

---

## 📂 Estrutura do Projeto

```
├── Main.java                    // Classe principal (entrada do usuário)
├── Menu.java                    // Classe que exibe menu visual
├── Converter.java               // Classe responsável pela chamada da API
├── Conversion.java              // Record que representa o JSON de resposta
├── ConversionHistory.java       // Classe que salva o histórico da conversão
├── history.json                 // Arquivo gerado com o histórico
```

---

## 📸 Exemplo de uso

```
====== Seja bem-vindo(a) ao Conversor de Moedas ======
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Euro
4) Euro =>> Dólar
5) Dólar =>> Real brasileiro
6) Real brasileiro =>> Dólar
7) Sair

Escolha uma opção válida:
> 5

Digite o valor que deseja converter:
> 100

Valor: 100.0 USD corresponde ao valor final de =>>> 534.50 BRL
```

---

## 💡 Possíveis Melhorias Futuras

- Validação e formatação avançada de entrada
- Integração com banco de dados para salvar o histórico

---

## 👨‍💻 Autor

Arthur Oliveira (https://github.com/ArthurZal)

