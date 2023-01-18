class Controller
Отвечает за запуск программы, содержит единственный метод run(), который выводит в консоль меню выбора действий пользователя и запрашивает ввод данных

class Attendance
Посещаемость студента сделал в отдельную сущность, чтобы разгрузить класс Student

Содержит методы:

addDateVisit(LocalDate date, Boolean visit) - добавление даты и результата посещения занятия студентом
attendanceCount() - метод возвращает количество посещений занятий студентом
percentAttendance() - метод возвращает процент посещения занятий студентом
class Student
POJO класс, реализует интерфейс Comparable

Метод compareTo - сортирует студентов по посещаемости в порядке убывания (от большего к меньшему)

class AttendanceService
Класс для обработки данных о студентах

Содержит методы:

dataRead() - метод, обрабатывает данные полученные из файла с информацией о студентах и возвращает их в виде списка (предполагается, что данные в файле, будут всегда одного формата и вида)
abstract class AttendanceView
Класс для удобства вывода информации по запросу пользователя

Содержит один абстрактный метод showInfo()

class ShowAllAttendance
Класс наследует AttendanceView и реализует его метод showInfo()

Выводит всю информацию о студентах

class SortedStudentByAttendanceDecrease
Класс наследует AttendanceView и реализует его метод showInfo()

Выводит информацию о студентах в отсортированном порядке по посещаемости

class SortedStudentByAttendanceUnder25Percent
Класс наследует AttendanceView и реализует его метод showInfo()

Выводит информацию о студентах, у которых посещаемость ниже 25%