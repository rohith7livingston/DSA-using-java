# class College:
#     code = "22K61A"
#     def __init__(self, name, location):
#         self.name = name
#         self.location = location
#         self.departments = []
#         self.students = []

# sasi = College("sasi","tadepalligudem")
# print(sasi.location)
# print(sasi.code)

"""
multiple constructors
"""
# class College:
#     code = "22K61A"
#     def __init__(self, name, location):
#         self.name = name
#         self.location = location
#         self.departments = []
#         self.students = []

#     @classmethod
#     def from_string(cls, random_str):
#         name, location = random_str.split(',')
#         return cls(name, location)
    
#     @classmethod
#     def from_dict(cls, info_dict):
#         return cls(info_dict['name'], info_dict['location'])
    
#     def display_info(self):
#         print(f"College Name: {self.name}, Location: {self.location}")

# sasi = College.from_string("sasi,tadepalligudem")
# sasi.display_info()
# sasi2 = College.from_dict({'name': 'sasi', 'location': 'tadepalligudem'})
# sasi2.display_info()

"""
dunder Methods
"""

# class Book:
#     def __init__(self, title, author):
#         self.title = title
#         self.author = author

#     def __str__(self):
#         return f"Book: {self.title} by {self.author}"

#     def __repr__(self):
#         return f"Book('{self.title}', '{self.author}')"

# b = Book("Python OOPs", "Rohit")
# # print(b)        # Book: Python OOPs by Rohit  (__str__ called)
# b                # Book('Python OOPs', 'Rohit')  (__repr__ used in console)
# print(b)

# class Point:
#     def __init__(self, x, y):
#         self.x = x
#         self.y = y

#     def __add__(self, other):
#         return Point(self.x + other.x, self.y + other.y)

# p1 = Point(1, 2)
# p2 = Point(3, 4)
# p3 = p1 + p2  # __add__ is called
# print(p3.x, p3.y)  # 4 6

# class Greeter:
#     def __init__(self, name):
#         self.name = name

#     def __call__(self):
#         print(f"Hello, {self.name}!")

# g = Greeter("Alice")
# g()  # Hello, Alice!  (__call__ called)

"""
Inheritcance
"""

# class Person:
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age

#     def display_info(self):
#         print(f"Name: {self.name}, Age: {self.age}")


# class Student(Person):
#     def __init__(self, name, age, student_id):
#         super().__init__(name, age)
#         self.student_id = student_id

#     def display_info(self):
#         super().display_info()
#         print(f"Student ID: {self.student_id}")

# s = Student("Rohit", 20, "22K61A0529")
# s.display_info()
# class Father:
#     def skills(self):
#         print("Gardening, Driving")

# class Mother:
#     def skills(self):
#         print("Cooking, Art")

# class Child(Father, Mother):
#     def skills(self):
#         print("Sports, Music")
# c = Child()
# c.skills()
# c = Mother()
# c.skills()  # Father’s method (because of order: Father first)


# class Parent:
#     def __init__(self):
#         print("Parent Constructor")
#     def hi(self):
#         print("Parent is saying hi")
# class Child(Parent):
#     def __init__(self):
#         super().__init__()
#         print("Child constructor") 
#         super().hi()
# c = Child()  # Parent Constructor Child constructor

# class Father:
#     def __init__(self,name,age):
#         self.name = name
#         self._age = age
#     def __display_info(self):
#         print(f"Father Name: {self.name}, Age : {self._age}")
# f = Father("Rohit",50)
# f.__display_info()

# from abc import ABC , abstractmethod

# class Shape(ABC):
#     def __init__(self):
#         self.color = "Red"
#     @abstractmethod
#     def area(self):
#         pass
#     @abstractmethod
#     def display(self):
#         print(f"This is a shape and its color is :{self.color}")

# class Rectangle(Shape):
#     def __init__(self, width, height):
#         super().__init__()
#         self.width = width
#         self.height = height
#     def area(self):
#         return self.width * self.height
#     def display(self):
#         super().display()
#         print(f"This is a rectangle with width {self.width} and height {self.height}, color: {self.color}")

# rec = Rectangle(5,10)
# print(rec.area())
# rec.display()


f = open("Prep_py.txt","r")
# print(f)
# print("Name",f.name)
# f.close()
# print(f.closed)
content = f.read()
print(content)

with open("Prep_py.txt","a") as f:
    f.write("Christ is King")

f.close()