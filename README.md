# sorokinJava
# testingAlgorithms

## Задание №4

**Вопрос:**

Дана скобочная последовательность: `[((())()(())]]`
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос "нет", то что необходимо в ней изменить, чтобы она стала правильной?

**Ответ:**

Нет, данную скобочную последовательность нельзя считать правильной. Правильная скобочная последовательность предполагает, что каждой открывающей скобке соответствует закрывающая, и они должны идти в правильном порядке. 

Для последовательности `[((())()(())]]`, проблема заключается в неправильном балансе скобок. Давайте проанализируем:

1. Открывающая квадратная скобка "["
2. Открывающая круглая скобка "("
3. Открывающая круглая скобка "("
4. Закрывающая круглая скобка ")"
5. Закрывающая круглая скобка ")"
6. Открывающая круглая скобка "("
7. Закрывающая круглая скобка ")"
8. Открывающая круглая скобка "("
9. Закрывающая круглая скобка ")"
10. Закрывающая круглая скобка ")"
11. Закрывающая квадратная скобка "]"

Видим, что перед последней закрывающей круглой скобкой ")" отсутствует соответствующая ей открывающая "(". Чтобы последовательность стала правильной, необходимо добавить открывающую круглую скобку после первой пары закрывающих круглых скобок или удалить одну из закрывающих круглых скобок. 

То есть правильная скобочная последовательность будет выглядеть так:[((())()(()))] или [((())(())]

Таким образом, скобки будут правильно сбалансированы.
