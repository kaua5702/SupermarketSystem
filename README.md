## 🛒 SupermarketSystem

---

Um sistema simples de supermercado desenvolvido em Java.  
Este projeto simula um cliente comprando produtos, registrando a compra no caixa (Box), aplicando promoções, calculando troco e emitindo uma nota fiscal.

---

## 📌 Funcionalidades
- Adicionar produtos ao carrinho de um cliente.
- Calcular o valor total da compra.
- Aplicar promoções (10% de desconto em compras acima de R$100).
- Calcular o troco com base no valor pago.
- Emitir uma nota fiscal formatada em inglês.

---

## 🏗️ Estrutura do Projeto
- **Product**: Representa um item com nome e preço.
- **Client**: Representa um cliente com uma lista de produtos.
- **Box**: Representa o caixa, responsável por registrar compras, aplicar promoções, calcular troco e emitir notas fiscais.
- **Main**: Ponto de entrada da aplicação, lida com entrada de dados do usuário e simula o processo de compra.

---

## ▶️ Como Executar
1. Compile o projeto:
   ```bash
   mvn clean install
   ```
ou, se estiver usando apenas Java:
```
javac com/kauabiscotto/SupermarketSystem/*.java
```

- Execute o programa:
```
java com.kauabiscotto.SupermarketSystem.Main
```

---

## 💻 Exemplo de Execução

Enter customer name: John

Add products to the cart (type 'done' to finish):

Product name: Milk

Product price: 5.50

Product name: Bread

Product price: 3.20

Product name: done

--

Invoice - Customer: John

Items purchased:

 - Milk - $5.50
 
 - Bread - $3.20

Subtotal: $8.70

Total to pay: $8.70


Enter amount paid: 10.0

Change to return: $1.30




