# Practical_tasks/в каждой ветке представлено сответствующее решение каждой практической.
# Задание к Практической №5

Вам нужно написать два класса MovablePoint и MovableCircle - которые реализуют интерфейс Movable на основе классов,
разработанных в практической работе № 4.

# Задание к Практической №6

1. Добавьте в проект ранее разработанный класс прямоугольник (Rectangle). Если его нет, то создайте его. На основе него напишите новый класс
MovableRectangle (движущийся прямоугольник). Ваш класс должен реализовывать интерфейс Movable
2. Прямоугольник можно также представить как две движущиеся точки MovablePoints (представляющих верхняя левая и нижняя
правая точки) и реализующие интерфейс Movable.
3. Убедитесь, что две точки имеет одну и ту же скорость (нужно добавить метод, который проверяет двигатются ли точки с одной и той же скорость ).

# Задание к Практической №7

1. Создать абстрактный класс, описывающий посуду (Dish). С помощью наследования реализовать различные виды посуды, имеющие свои свойства и методы. Протестировать работу классов.
2. Создать абстрактный класс, описывающий собак (Dog). С помощью наследования реализовать различного вида пород собак. Протестировать работу классов.

# Задание к Практической №8

1. Создать абстрактный класс, описывающий мебель. С помощью наследования реализовать различные виды мебели. Реализовать класс магазина мебели (FurnitureShop), реализовать каталог мебели, с возможность покупки. Создать консольный интерфейс.

# Задание к Практической №9 и №10

1. Создайте класс Employee, определяющий сотрудника. Необходимые поля – Фамилия, Имя, фиксированная часть зарплаты(оклад), должность(см пункт 2).
2. Создайте интерфейс EmployeePosition, определяющий должность. Определите в нем метод String getJobTitle(), возвращающий название занимаемой должности, и double calcSalary(), возвращающий зарплату сотрудника, в соответствии с его фиксированным окладом.
3. Создайте классы, определяющие должности сотрудников. Все они должны реализовывать интерфейс EmployeePosition

    -  Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег. Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
    -  TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы, если доход сотрудников рангом ниже более 10 млн рублей.
    - Operator — зарплата складывается только из фиксированной части.

4. Создайте класс компании Company, содержащий сотрудников и реализующей методы:

-   найм одного сотрудника — hire(),
-   найм списка сотрудников – hireAll(),
-   увольнение сотрудника – fire(),
-   получение значения дохода компании – getIncome().

Аргументы и возвращаемое значение методов выберите на основании логики работы вашего приложения.

Создайте два метода, возвращающие список указанной длины (count). Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы:
-   List<Employee> getTopSalaryStaff(int count),
-   List<Employee> getLowestSalaryStaff(int count).

Аргументы и возвращаемое значение метода выберите в соответствии с логикой начисления зарплат.

## Для демонстрации и тестирования работы ваших классов: 
1. Создайте компанию и наймите в неё: 180 операторов Operator, 80 менеджеров по продажам Manager, 10 топ-менеджеров TopManager. 
2. Распечатайте список из 10–15 самых высоких зарплат в компании. 
3. Распечатайте список из 30 самых низких зарплат в компании. 
4. Увольте 50% сотрудников. 
5. Распечатайте список из 10–15 самых высоких зарплат в компании. 
6. Распечатайте список из 30 самых низких зарплат в компании. Примеры вывода списка зарплат Список из пяти зарплат по убыванию: 
    - 230 000 руб. 
    - 178 000 руб. 
    - 165 870 руб. 
    - 123 000 руб. 
    - 117 900 руб.

## Рекомендации:
-   Можно создавать разные экземпляры компании со своим списком сотрудников и доходом.
-   Чтобы получить данные компании внутри класса должности, настройте хранение ссылки на Company и передавайте объект Company с помощью конструктора или сеттера.
-   Учтите, в методы получения списков зарплат могут передаваться значения count, превышающие количество сотрудников в компании, или отрицательные.
