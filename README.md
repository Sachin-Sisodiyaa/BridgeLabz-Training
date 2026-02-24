## 🎯 Overview

This repository documents a comprehensive journey through Java's Collections Framework, covering everything from **Generics** to **Reflection**, from **Streams** to **Real-World Applications**.

**Training Program:** BridgeLabz Fellowship  
**Duration:** 3 Weeks (January 9 - 24, 2026)  
**Focus:** Production-ready implementations with industry best practices

### What's Covered

- Generic Programming & Type Safety
- Collections Framework (List, Set, Map, Queue)
- Stream API & Functional Programming
- Exception Handling Strategies
- Regex Pattern Matching
- JUnit Testing & TDD
- Reflection & Custom Annotations
- 10 Real-World Industry Projects

<br/>

<!-- Visual Separator -->
<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png" width="100%">
</p>

<br/>

## 📁 Project Structure

```
🌳 java-collections-practice/
│
├── 📦 gcr-codebase/
│   └── JavaCollectionsPractice/
│       └── src/com/
│           │
│           ├── 🎨 generics/                    → Type-Safe Programming
│           └── 🎁 collections/
│               │
│               ├── 📋 listinterface/           → ArrayList, LinkedList, Vector
│               ├── 🎲 setinterface/            → HashSet, TreeSet, LinkedHashSet
│               ├── 🗺️ mapinterface/             → HashMap, TreeMap, LinkedHashMap
│               ├── 🔄 queueinterface/          → PriorityQueue, Deque, ArrayDeque
│               ├── 🌊 streams/                 → File I/O, Object Streams
│               ├── 🔤 regex/                   → Pattern Matching
│               ├── ✅ junit/                   → Unit Testing
│               ├── 🔍 reflections/             → Runtime Analysis
│               └── 📝 annotations/             → Custom Annotations
│
└── 💼 scenario-based/
    └── JavaCollectionsScenario/src/com/
        │
        ├── 📅 day1/   
        └── 📅 day2/                 

```

<br/>

<!-- Visual Separator -->
<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png" width="100%">
</p>

<br/>

## 📖 Learning Journey

### Timeline Overview

```mermaid
timeline
    title Collections Framework Learning Path
    section Week 4
        Jan 09 : Generics Foundation : Type Parameters : Wildcards & Bounds
    section Week 5
        Jan 16 : Collections Framework : List, Set, Map, Queue : Interface Mastery
    section Week 6
        Jan 19 : Java Streams : I/O Operations
        Jan 20 : Exception Handling : Custom Exceptions
        Jan 21 : Regex & JUnit : Pattern Matching : Unit Testing
        Jan 22 : Reflection & Annotations : Metadata Programming
        Jan 23 : Scenarios Set 1 : 5 Real Projects
        Jan 24 : Scenarios Set 2 : 5 Advanced Projects
```

</div>

<br/>

---

### Week 4: Generics Foundation

<table>
<tr>
<td width="20%" align="center">

**📅 DAY 5**  
*Jan 9, 2026*

</td>
<td width="80%">

<details open>
<summary><b>🎯 Generics Mastery</b></summary>

<br/>

<table>
<tr>
<td width="50%">

**📚 Topics Covered**

- Type Parameters (`<T>`, `<K,V>`)
- Generic Classes & Methods
- Bounded Type Parameters
  - Upper Bounds (`<T extends Number>`)
  - Lower Bounds (`<T super Integer>`)
- Wildcards (`?`, `? extends`, `? super`)
- Type Erasure & Runtime Behavior

</td>
<td width="50%">

**💡 Key Learnings**

```java
// Generic Method Example
public <T extends Comparable<T>> 
T findMax(List<T> list) {
    return Collections.max(list);
}

// Wildcard Usage
public void process(
    List<? extends Number> nums
) {
    // Process any number type
}
```

</td>
</tr>
</table>

**🔗 [View Complete Implementation →](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/generics)**

</details>

</td>
</tr>
</table>

<br/>

---

### Week 5: Collections Framework

<table>
<tr>
<td width="20%" align="center">

**📅 DAY 5**  
*Jan 16, 2026*

</td>
<td width="80%">

<details open>
<summary><b>🗂️ Complete Collections Ecosystem</b></summary>

<br/>

<!-- Collections Hierarchy Visualization -->
<div align="center">

```mermaid
graph TB
    A[Collection Interface] --> B[List]
    A --> C[Set]
    A --> D[Queue]
    E[Map Interface] --> F[HashMap]
    E --> G[TreeMap]
    E --> H[LinkedHashMap]
    B --> I[ArrayList]
    B --> J[LinkedList]
    B --> K[Vector]
    C --> L[HashSet]
    C --> M[TreeSet]
    C --> N[LinkedHashSet]
    D --> O[PriorityQueue]
    D --> P[ArrayDeque]
    
    style A fill:#667eea
    style E fill:#764ba2
    style B fill:#f72585
    style C fill:#4cc9f0
    style D fill:#fca311
```

</div>

<br/>

<table>
<tr>
<th width="25%">📋 List</th>
<th width="25%">🎲 Set</th>
<th width="25%">🗺️ Map</th>
<th width="25%">🔄 Queue</th>
</tr>
<tr>
<td valign="top">

**Implementations:**
- ArrayList
- LinkedList
- Vector
- Stack

**Use Cases:**
- Ordered data
- Duplicates allowed
- Index-based access

**[📂 Code](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/collections/listinterface)**

</td>
<td valign="top">

**Implementations:**
- HashSet
- TreeSet
- LinkedHashSet

**Use Cases:**
- Unique elements
- Fast lookup
- No duplicates

**[📂 Code](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/collections/setinterface)**

</td>
<td valign="top">

**Implementations:**
- HashMap
- TreeMap
- LinkedHashMap
- Hashtable

**Use Cases:**
- Key-value pairs
- Fast retrieval
- Caching

**[📂 Code](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/collections/mapinterface)**

</td>
<td valign="top">

**Implementations:**
- PriorityQueue
- ArrayDeque
- LinkedList

**Use Cases:**
- FIFO operations
- Task scheduling
- BFS traversal

**[📂 Code](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/collections/queueinterface)**

</td>
</tr>
</table>

</details>

</td>
</tr>
</table>

<br/>

---

### Week 6: Advanced Java Concepts

<!-- Day-wise breakdown in card format -->
<table>
<tr>
<td width="50%" valign="top">

#### Day 1: Java Streams  
*January 19, 2026*

<details>
<summary>I/O Stream Operations</summary>

<br/>

**Stream Types:**
- 📄 File Streams
- 🎁 Object Streams
- 📦 ByteArray Streams
- ⚡ Buffered Streams
- 📖 Reader & Writer

**Practical Skills:**
- File handling
- Serialization
- Data persistence
- Performance optimization

**[📂 View Implementation](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/streams)**

</details>

---

#### Day 3: Regex & Testing  
*January 21, 2026*

<details>
<summary>Pattern Matching & Quality Assurance</summary>

<br/>

**Regex Patterns:**
- 📧 Email Validation
- 🔐 Password Strength
- 📱 Phone Formatting
- 🔍 Text Extraction

**JUnit Framework:**
- ✅ Annotations
- 🧪 Test Cases
- 📊 Assertions
- 🎯 Test Suites

**[📂 Regex Code](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/regexandjunit/regex)** | **[📂 JUnit Code](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/regexandjunit/junit)**

</details>

</td>
<td width="50%" valign="top">

#### Day 2: Exception Handling  
*January 20, 2026*

<details>
<summary>Robust Error Management</summary>

<br/>

**Exception Types:**
- ✅ Checked Exceptions
- ❌ Unchecked Exceptions
- 🎨 Custom Exceptions

**Handling Strategies:**
- try-catch blocks
- try-catch-finally
- try-with-resources
- Exception chaining

**[📂 View Implementation](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/exceptionhandling)**

</details>

---

#### Day 4: Reflection & Annotations  
*January 22, 2026*

<details>
<summary>Metadata Programming</summary>

<br/>

**Reflection API:**
- Class inspection
- Dynamic invocation
- Runtime analysis

**Annotations:**
- Built-in annotations
- Custom annotations
- Annotation processing
- Real-world use cases

**[📂 Reflection Code](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/reflections)** | **[📂 Annotations Code](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/javaCollectionsFramework/src/com/annotations)**

</details>

</td>
</tr>
</table>

<br/>

---

### Real-World Scenario Projects

<!-- Scenarios in Modern Card Design -->
<table>
<tr>
<td width="50%" valign="top">

### Day 5: Scenarios Set 1  
*January 23, 2026*

<br/>

<table>
<tr>
<th width="10%">🏆</th>
<th width="50%">Project</th>
<th width="40%">Tech Stack</th>
</tr>
<tr>
<td align="center">1</td>
<td><b>🔍 ResumeAnalyzer</b><br/><sub>Smart HR Filtering System</sub></td>
<td><code>I/O</code> <code>Regex</code> <code>Map</code></td>
</tr>
<tr>
<td align="center">2</td>
<td><b>✈️ TravelLog</b><br/><sub>Trip Organizer App</sub></td>
<td><code>Serialization</code> <code>Set</code> <code>Map</code></td>
</tr>
<tr>
<td align="center">3</td>
<td><b>📊 FeedbackGuru</b><br/><sub>Survey Analysis Tool</sub></td>
<td><code>Regex</code> <code>Generics</code> <code>Map</code></td>
</tr>
<tr>
<td align="center">4</td>
<td><b>🛠️ CodeRepoCleaner</b><br/><sub>Java File Organizer</sub></td>
<td><code>I/O</code> <code>Regex</code> <code>Streams</code></td>
</tr>
<tr>
<td align="center">5</td>
<td><b>📝 ExamScanner</b><br/><sub>Answer Sheet Validator</sub></td>
<td><code>CSV</code> <code>Generics</code> <code>Queue</code></td>
</tr>
</table>

**[🔗 View All Day 1 Projects](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/scenario-based/scenarioBased/src/com/dayone)**

</td>
<td width="50%" valign="top">

### Day 6: Scenarios Set 2  
*January 24, 2026*

<br/>

<table>
<tr>
<th width="10%">🏆</th>
<th width="50%">Project</th>
<th width="40%">Tech Stack</th>
</tr>
<tr>
<td align="center">1</td>
<td><b>🏥 MedInventory</b><br/><sub>Hospital Inventory Tracker</sub></td>
<td><code>CSV</code> <code>Regex</code> <code>Exceptions</code></td>
</tr>
<tr>
<td align="center">2</td>
<td><b>💬 ChatLogParser</b><br/><sub>Message Analytics Engine</sub></td>
<td><code>Regex</code> <code>TreeMap</code> <code>Generics</code></td>
</tr>
<tr>
<td align="center">3</td>
<td><b>🎵 SongVault</b><br/><sub>Music Library Manager</sub></td>
<td><code>I/O</code> <code>Streams</code> <code>Set</code></td>
</tr>
<tr>
<td align="center">4</td>
<td><b>🎓 ExamResultUploader</b><br/><sub>Bulk Marks Processor</sub></td>
<td><code>CSV</code> <code>Map</code> <code>PriorityQueue</code></td>
</tr>
<tr>
<td align="center">5</td>
<td><b>🛒 DealTracker</b><br/><sub>E-Commerce Validator</sub></td>
<td><code>Regex</code> <code>Set</code> <code>Comparator</code></td>
</tr>
</table>

**[🔗 View All Day 2 Projects](https://github.com/Sachin-Sisodiyaa/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/scenario-based/scenarioBased/src/com/daytwo)**

</td>
</tr>
</table>

<br/>

<!-- Visual Separator -->
<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png" width="100%">
</p>

<br/>

## 💎 Key Concepts Mastered

<table>
<tr>
<td width="33%" align="center" valign="top">

### Core Java

<br/>

```
▸ Generic Programming
▸ Type Safety
▸ Parameterized Types
▸ Bounded Types
▸ Wildcards
▸ Type Erasure
▸ Lambda Expressions
▸ Method References
```

</td>
<td width="33%" align="center" valign="top">

### Collections Framework

<br/>

```
▸ List Interface
▸ Set Interface
▸ Map Interface
▸ Queue Interface
▸ Sorting & Searching
▸ Comparators
▸ Collections Utils
▸ Concurrent Collections
```

</td>
<td width="33%" align="center" valign="top">

### Advanced Topics

<br/>

```
▸ Stream API
▸ Exception Handling
▸ Regex Patterns
▸ JUnit Testing
▸ Reflection API
▸ Custom Annotations
▸ Serialization
▸ File I/O
```

</td>
</tr>
</table>

<br/>
