<%--
  Created by IntelliJ IDEA.
  User: George
  Date: 9/18/2019
  Time: 9:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INDEX</title>
    <script src="js/vue/vue.js"></script>
</head>
<body>
<h2>INDEX</h2>
<div id="app">
    {{ message }}
</div>
<div id="app-2">
  <span v-bind:title="message">
    Наведи на меня курсор на пару секунд,
    чтобы увидеть динамически связанное значение title!
  </span>
</div>
<div id="app-3">
    <span v-if="seen">Сейчас меня видно</span>
</div>
<div id="app-4">
    <ol>
        <li v-for="todo in todos">
            {{ todo.text }}
        </li>
    </ol>
</div>
<div id="app-5">
    <p>{{ message }}</p>
    <button v-on:click="reverseMessage">Перевернуть сообщение</button>
    <button v-on:click="reverseMessageTwo">Перевернуть сообщение 2</button>
</div>
<script>
    var app5 = new Vue({
        el: '#app-5',
        data: {
            message: 'Привет, Vue.js!'
        },
        methods: {
            reverseMessage: function () {
                console.log("click");
                // this.message = this.message.split('').reverse().join('')
            },
            reverseMessageTwo: function () {
                console.log("click two");
                // this.message = this.message.split('').reverse().join('')
            }
        }
    })
    var app4 = new Vue({
        el: '#app-4',
        data: {
            todos: [
                { text: 'Изучить JavaScript' },
                { text: 'Изучить Vue' },
                { text: 'Создать что-нибудь классное' }
            ]
        }
    })
    var app3 = new Vue({
        el: '#app-3',
        data: {
            seen: true
        }
    })
    var app2 = new Vue({
        el: '#app-2',
        data: {
            message: 'Вы загрузили эту страницу: ' + new Date().toLocaleString()
        }
    })
    var app = new Vue({
        el: '#app',
        data: {
            message: 'Вы загрузили эту страницу: ' + new Date().toLocaleString()
        }
    })
</script>
</body>
</html>
