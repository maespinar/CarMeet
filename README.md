# 🚗 CarMeet - Sistema de Gestión y Evaluación de Vehículos

Un sistema basado en consola desarrollado en Java para gestionar eventos de exhibición de autos. Este proyecto permite registrar participantes (Staff y Expositores), clasificar vehículos (Clásicos y Tuning) y realizar una auditoría automática para determinar si los autos cumplen con los requisitos para participar en el evento.

## ⚙️ Características Principales

*   **CRUD Personalizado:** Registro, eliminación, búsqueda y modificación de participantes utilizando arreglos estáticos y algoritmos de desplazamiento.
*   **Auditoría Automática:** Un sistema de evaluación que calcula el puntaje de exhibición de los vehículos y aprueba o rechaza participantes basado en reglas específicas de cada tipo de auto.
*   **Tipado Estricto:** Uso de enumeradores (`Enums`) para categorizar vehículos (JDM, EURO, MUSCLE, etc.) y asignar zonas (VIP, ESCENARIO, etc.).

## 🏗️ Estructura del Proyecto (Arquitectura)

El proyecto está modularizado en 6 paquetes principales para mantener un código limpio y escalable (aplicando el Principio de Responsabilidad Única - SRP):

*   **`Personas/`**: Contiene la clase abstracta base y los actores del sistema (`Staff`, `Expositor`).
*   **`Vehiculos/`**: Lógica de los autos, heredando de una clase abstracta e implementando reglas de negocio (`AutoTuning`, `AutoClasico`).
*   **`Gestiones/`**: Clases encargadas del almacenamiento y operaciones de datos (`GestionExpositor`, `GestionStaff`).
*   **`Acciones/`**: Controladores que ejecutan la lógica del evento (`EvaluacionVehiculos`).
*   **`Interfaces/`**: Contratos que aseguran el comportamiento del sistema (`Auditable`, `Gestiones<T>`).
*   **`Enums/`**: Constantes predefinidas (`Categoria`, `Zona`).

## 🧠 Conceptos de POO Aplicados

Este proyecto fue desarrollado como práctica intensiva de Programación Orientada a Objetos en Java, implementando:

1.  **Herencia y Clases Abstractas:** Plantillas base para Vehículos y Personas.
2.  **Polimorfismo:** Diferentes comportamientos para el cálculo de puntajes según el tipo de vehículo.
3.  **Interfaces y Tipos Genéricos (`<T>`):** Una interfaz de gestión única que se adapta dinámicamente a cualquier tipo de objeto (Staff o Expositores).
4.  **Composición:** Objetos complejos creados a partir de otros objetos (Un Expositor "tiene un" Vehículo).

## 🚀 Próximas Mejoras (To-Do)

*   [ ] Implementar la interfaz `Comparable` para generar un Podio (Top 3) de los mejores vehículos.
*   [ ] Implementar una UI para mejorar la calidad de la experiencia.
