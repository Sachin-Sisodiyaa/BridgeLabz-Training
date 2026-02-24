## 🎯 Overview

Welcome to **Week 6** of the BridgeLabz Java Training Program! This module explores **Java 8's revolutionary features** that transformed Java into a modern, expressive, and functional programming language.

### 🌟 What Makes This Special?

<table>
<tr>
<td width="33%" align="center">
<img src="https://img.icons8.com/color/96/000000/lambda.png" width="64" alt="Lambda"/>
<h4>🔥 Functional Programming</h4>
<p>Master lambda expressions and method references for cleaner, more expressive code</p>
</td>
<td width="33%" align="center">
<img src="https://img.icons8.com/fluency/96/000000/workflow.png" width="64" alt="Streams"/>
<h4>💧 Stream API</h4>
<p>Transform data processing with powerful declarative pipeline operations</p>
</td>
<td width="33%" align="center">
<img src="https://img.icons8.com/color/96/000000/code.png" width="64" alt="Real World"/>
<h4>🌍 Real-World Scenarios</h4>
<p>50+ practical problems from healthcare, e-commerce, IoT, and finance domains</p>
</td>
</tr>
</table>

### 📅 Learning Timeline

> **📆 Learning Period:** January 27-28, 2025  
> **🌿 Branch:** `java8-programming-practice`  
> **✅ Total Problems Solved:** 50+  
> **⏱️ Duration:** 2 Days Intensive Practice

---

## 📁 Project Structure

```plaintext
java8-programming-practice/
│
├── 📂 gcr-codebase/
│   └── Java8Concepts/
│       └── src/com/
│           ├── 🔹 collectors/              # Grouping, partitioning & aggregations
│           ├── 🔹 functionalinterfaces/    # Predicate, Function, Consumer, Supplier
│           ├── 🔹 LambdaExpressions/       # Lambda syntax & implementations
│           ├── 🔹 methodreferences/        # Static, instance & constructor references
│           └── 🔹 streamapi/               # Filter, map, reduce operations
│               └── foreach/                # Iteration patterns
│
└── 📂 scenario-base/
    └── java8scenario/
        └── src/com/streamapi/
            ├── 📊 employeestreamscenario/     # Employee data analysis
            ├── 📊 logicalquestions1/           # Complex stream challenges
            └── 📊 studentstreamscenario/       # Student performance analytics
```

---

## 📚 Learning Journey

### 🗓️ Week 6: Java 8 & Functional Programming Mastery

> **🎯 Focus Areas:** Lambda Expressions • Functional Interfaces • Stream API • Collectors • Method References

---

<details open>
<summary><h3>📅 Day 1 - Lambda Expressions & Method References (Part 1)</h3></summary>

**📆 Date:** January 27, 2025  
**🎯 Focus:** Functional programming foundations with lambda syntax and method references

#### 🎓 Topics Covered
```
✅ Lambda expression syntax and structure
✅ Functional programming paradigms
✅ Lambda vs Anonymous classes comparison
✅ Method references (Static, Instance, Constructor)
✅ Type inference and variable capture
✅ Scope and closures in lambda expressions
```

#### 💡 Real-World Scenarios Solved

<table>
<tr>
<th width="50%">🔸 Lambda Expressions (3 Problems)</th>
<th width="50%">🔸 Method References (3 Problems)</th>
</tr>
<tr>
<td valign="top">

**1. 🏠 Smart Home Lighting Automation**  
Define light activation behaviors for motion, time, and voice triggers dynamically without creating multiple classes

**2. 🛒 Custom E-Commerce Sorting**  
Implement dynamic product sorting with lambda-based Comparator (by price, rating, discount)

**3. 🏥 Hospital Notification Filtering**  
Filter patient alerts using lambda expressions with Predicate based on user preferences

</td>
<td valign="top">

**1. 🏥 Patient ID Printing**  
Print all patient IDs from a list for admin verification using method references

**2. 📝 Name Uppercasing**  
Convert employee names to uppercase for HR letters using `String::toUpperCase`

**3. 🧾 Invoice Object Creation**  
Generate invoice objects from transaction IDs using constructor references

</td>
</tr>
</table>

**🔗 View Code:** [Lambda Expressions](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/LambdaExpressions) • [Method References](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/methodreferences)

</details>

---

<details>
<summary><h3>📅 Day 1 - Functional Interfaces (Part 2)</h3></summary>

**📆 Date:** January 27, 2025  
**🎯 Focus:** Interface design patterns, functional interfaces, and Java 8 interface enhancements

#### 🎓 Topics Covered
```
✅ Defining and implementing interfaces (best practices)
✅ @FunctionalInterface annotation
✅ Built-in functional interfaces (Predicate, Function, Consumer, Supplier)
✅ Default and static methods in interfaces
✅ Marker interfaces
✅ BiFunction, BiConsumer, BiPredicate
```

#### 💡 Real-World Scenarios Solved

**🔹 Defining and Implementing Interfaces (3 Problems)**

| # | Scenario | Implementation |
|---|----------|----------------|
| 1 | 🏠 **Smart Device Control Interface** | Create interface for `turnOn()` and `turnOff()` methods across lights, AC, and TV |
| 2 | 🚗 **Multi-Vehicle Rental System** | Interface-based design for cars, bikes, and buses with `rent()` and `returnVehicle()` |
| 3 | 💳 **Digital Payment Interface** | Define and implement `pay()` method for UPI, Credit Card, and Wallet |

**🔹 Functional Interfaces (3 Problems)**

| # | Scenario | Functional Interface Used |
|---|----------|---------------------------|
| 1 | 🌡️ **Temperature Alert System** | `Predicate<Double>` - Alert if temperature crosses threshold |
| 2 | 📏 **String Length Checker** | `Function<String, Integer>` - Check if message exceeds character limit |
| 3 | ⚙️ **Background Job Execution** | `Runnable` - Execute tasks asynchronously |

**🔹 Static Methods in Interfaces (3 Problems)**

| # | Scenario | Use Case |
|---|----------|----------|
| 1 | 🔐 **Password Strength Validator** | Static method in `SecurityUtils` interface for password policy validation |
| 2 | 📦 **Unit Conversion Tool** | Static methods for standard unit conversions (km↔miles, kg↔lbs) |
| 3 | 📅 **Date Format Utility** | Static interface method to format dates in multiple formats |

**🔹 Default Methods in Interfaces (3 Problems)**

| # | Scenario | Solution |
|---|----------|----------|
| 1 | 💳 **Payment Gateway Integration** | Add default `refund()` method without breaking existing providers |
| 2 | 📊 **Data Export Feature** | Add default `exportToJSON()` method to existing CSV/PDF exporters |
| 3 | 🚗 **Smart Vehicle Dashboard** | Default method to display battery percentage for electric vehicles |

**🔹 Marker Interfaces (3 Problems)**

| # | Scenario | Marker Interface |
|---|----------|------------------|
| 1 | 💾 **Data Serialization for Backup** | `Serializable` for backup storage |
| 2 | 📋 **Cloning Prototype Objects** | `Cloneable` for object cloning |
| 3 | 🔒 **Sensitive Data Tagging** | Custom marker interface for encryption |

**🔗 View Code:** [Functional Interfaces](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/functionalinterfaces)

</details>

---

<details>
<summary><h3>📅 Day 2 - Stream API & forEach Method (Part 1)</h3></summary>

**📆 Date:** January 28, 2025  
**🎯 Focus:** Data transformation pipelines and declarative data processing

#### 🎓 Topics Covered
```
✅ Intermediate Operations: filter, map, flatMap, distinct, sorted, peek, limit, skip
✅ Terminal Operations: collect, forEach, reduce, count, anyMatch, allMatch, noneMatch
✅ Stateless vs Stateful operations
✅ Ordered vs Unordered streams
✅ Parallel streams & performance optimization
✅ forEach() — Iterable vs Stream comparison
```

#### 💡 Real-World Scenarios Solved

**🔹 Stream API Operations (5 Problems)**

<table>
<tr>
<td width="5%">1</td>
<td width="30%">🎬 <b>Top 5 Trending Movies</b></td>
<td>Find top 5 movies based on rating and release year using <code>filter()</code>, <code>sorted()</code>, <code>limit()</code></td>
</tr>
<tr>
<td>2</td>
<td>🏥 <b>Hospital Doctor Availability</b></td>
<td>Find weekend-available doctors and sort by specialty using streams with <code>filter()</code> and <code>sorted()</code></td>
</tr>
<tr>
<td>3</td>
<td>🏢 <b>Insurance Claim Analysis</b></td>
<td>Calculate average claim amount per claim type using <code>groupingBy()</code> and <code>averagingDouble()</code></td>
</tr>
<tr>
<td>4</td>
<td>💪 <b>Filtering Expiring Memberships</b></td>
<td>Filter gym members whose membership expires within 30 days using Stream API</td>
</tr>
<tr>
<td>5</td>
<td>👥 <b>Transforming Names for Display</b></td>
<td>Convert customer names to uppercase and sort alphabetically using <code>map()</code> and <code>sorted()</code></td>
</tr>
</table>

**🔹 forEach() Method (5 Problems)**

<table>
<tr>
<td width="5%">1</td>
<td width="30%">📈 <b>Stock Price Logger</b></td>
<td>Display all stock prices from live feed using <code>forEach()</code></td>
</tr>
<tr>
<td>2</td>
<td>🎉 <b>Event Attendee Welcome</b></td>
<td>Print welcome message for all attendees using <code>forEach()</code> with lambda</td>
</tr>
<tr>
<td>3</td>
<td>🌡️ <b>IoT Sensor Readings</b></td>
<td>Print readings above threshold using streams with <code>forEach()</code></td>
</tr>
<tr>
<td>4</td>
<td>📧 <b>Email Notifications</b></td>
<td>Send notification email to each user using <code>forEach()</code></td>
</tr>
<tr>
<td>5</td>
<td>📝 <b>Logging Transactions</b></td>
<td>Log each transaction with timestamp to console using <code>forEach()</code></td>
</tr>
</table>

**🔗 View Code:** [Stream API](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/streamapi) • [forEach](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/streamapi/foreach)

</details>

---

<details>
<summary><h3>📅 Day 2 - Collectors (Part 2)</h3></summary>

**📆 Date:** January 28, 2025  
**🎯 Focus:** Advanced data aggregation and grouping operations

#### 🎓 Topics Covered
```
✅ Collectors - Roles and capabilities
✅ toList(), toSet(), toMap()
✅ groupingBy(), partitioningBy()
✅ joining(), counting(), summarizing
✅ Custom collectors
✅ Downstream collectors
```

#### 💡 Real-World Scenarios Solved

**🔹 Collectors Operations (5 Problems)**

| # | Scenario | Collector Used | Description |
|---|----------|----------------|-------------|
| 1 | 🎓 **Student Result Grouping** | `groupingBy()` | Group students by grade level and collect names |
| 2 | 📝 **Word Frequency Counter** | `toMap()` | Analyze paragraph for word occurrence frequency |
| 3 | 💰 **Order Revenue Summary** | `summingDouble()` | Sum order totals per customer for revenue analysis |
| 4 | 👔 **Employee Salary Categorization** | `groupingBy()` + `averagingDouble()` | Calculate average salary per department |
| 5 | 📚 **Library Book Statistics** | `summarizingInt()` | Find total pages, average pages, and max pages per genre |

**💻 Code Example:**
```java
// Employee Salary Categorization
Map<String, Double> avgSalaryByDept = employees.stream()
    .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.averagingDouble(Employee::getSalary)
    ));
```

**🔗 View Code:** [Collectors](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/collectors)

</details>

---

## 🎓 Key Concepts Covered

<div align="center">

| 🎯 Category | 📚 Concepts | ✅ Status |
|------------|------------|-----------|
| **Lambda Expressions** | Syntax, Functional Programming, Type Inference, Variable Capture | Completed |
| **Method References** | Static References, Instance References, Constructor References | Completed |
| **Functional Interfaces** | Predicate, Function, Consumer, Supplier, BiFunction, Custom Interfaces | Completed |
| **Interface Enhancements** | Default Methods, Static Methods, Marker Interfaces | Completed |
| **Stream API** | Intermediate Operations (filter, map, flatMap, sorted, distinct, limit, skip) | Completed |
| **Stream API** | Terminal Operations (collect, forEach, reduce, count, match operations) | Completed |
| **Collectors** | groupingBy, partitioningBy, toList, toSet, toMap, joining, summarizing | Completed |
| **Advanced Streams** | Parallel Streams, Performance Optimization, Stateless vs Stateful | Completed |

</div>

---
