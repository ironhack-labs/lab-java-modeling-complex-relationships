# 🏥 Asociación de Enfermeros & 🎭 Gestión de Eventos – Proyecto Spring JPA

Este proyecto es una aplicación desarrollada con **Spring Boot**, **Spring Data JPA** y una base de datos embebida (H2) para practicar el modelado de relaciones, herencia y enumeraciones en aplicaciones Java.

El proyecto se divide en **dos dominios principales**:

---

## 🩺 1. Asociación de Enfermeros

Modelo de organización de capítulos regionales y membresía de una asociación profesional.

### Entidades:
- **Member**
  - `name`: nombre del miembro
  - `status`: estado de la membresía (`ACTIVE` o `LAPSED`)
  - `renewalDate`: fecha de renovación
- **Chapter**
  - `name`: nombre del capítulo
  - `district`: zona geográfica
  - `president`: miembro que actúa como presidente
  - `members`: lista de miembros del capítulo

### Relaciones:
- Un capítulo tiene una relación **OneToOne** con su presidente.
- Un capítulo tiene una relación **OneToMany** con sus miembros.

---

## 🎤 2. Aplicación de Gestión de Eventos

Modelo para gestionar eventos, como conferencias y exposiciones, junto con invitados y ponentes.

### Entidades abstractas y herencia:
- **Event** (abstracta)
  - `date`, `duration`, `location`, `title`, `guests`
- **Conference** hereda de Event
  - `speakers`: lista de ponentes
- **Exposition** hereda de Event

### Otras entidades:
- **Guest**
  - `name`
  - `status`: respuesta (`ATTENDING`, `NOT_ATTENDING`, `NO_RESPONSE`)
- **Speaker**
  - `name`
  - `presentationDuration`: duración de su ponencia

### Relaciones:
- `Event` → **OneToMany** con `Guest`
- `Conference` → **OneToMany** con `Speaker`

---

## 🔧 Tecnologías utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Maven
- JUnit 5
- (Opcional) Lombok

---

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio y abre el proyecto en tu IDE (VS Code, IntelliJ, etc.)
2. Asegúrate de tener Java y Maven instalados.
3. Ejecuta la clase `EventsApplication` como una aplicación Spring Boot.
4. Accede a la base de datos embebida en `http://localhost:8080/h2-console` si has activado el H2 console en `application.properties`.

---

## 🧪 Ejemplos de pruebas automáticas implementadas

- Crear nuevos miembros y capítulos.
- Buscar invitados por nombre o estado.
- Crear conferencias con ponentes.
- Buscar eventos según la distancia o si contienen la palabra "Boeing".
- Probar herencia y relaciones entre entidades.

---

## 📁 Estructura de carpetas

```

src/
└── main/java/com/example/events/
├── EventsApplication.java
├── enums/
│   ├── GuestStatus.java
│   └── MemberStatus.java
├── models/
│   ├── Chapter.java
│   ├── Member.java
│   ├── Event.java
│   ├── Conference.java
│   ├── Exposition.java
│   ├── Guest.java
│   └── Speaker.java
└── repositories/
├── ChapterRepository.java
├── MemberRepository.java
├── EventRepository.java
├── ConferenceRepository.java
├── ExpositionRepository.java
├── GuestRepository.java
└── SpeakerRepository.java

```

---

## ✍️ Autora

Mábel Martínez – Proyecto educativo desarrollado con fines de aprendizaje de Spring Boot y JPA.Ironhack.

