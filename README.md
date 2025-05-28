# 🩺 SugarTracker

**SugarTracker** es una aplicación Android moderna desarrollada con Jetpack Compose que permite a los usuarios monitorear y registrar sus niveles de glucosa, dosis de insulina y otros indicadores clave relacionados con la diabetes. Está diseñada con enfoque modular, escalable y con un alto estándar de calidad en código y arquitectura.

---

## 🚀 Tecnologías utilizadas

- **Kotlin 2.0.21** — Lenguaje principal.
- **Jetpack Compose (BOM 2024.09.00)** — UI declarativa moderna.
- **AGP 8.1.0** — Android Gradle Plugin.
- **Hilt (opcional)** — Inyección de dependencias.
- **Room (opcional)** — Persistencia local.
- **GitHub Flow** — Metodología para control de versiones y ramas.
- **JUnit / Espresso** — Pruebas unitarias y UI.
- **Gradle con `libs.versions.toml`** — Gestión centralizada de versiones.
- **Arquitectura modular** — `core`, `feature-*`, `app`.

---

## 🧠 Metodología y buenas prácticas

- ✅ **Tareas atómicas y secuenciales** — Cada avance del proyecto se organiza en tareas mínimas, bien definidas y con objetivos claros.
- ✅ **Validación estricta del entorno antes de cada tarea** — Se asegura la coherencia entre librerías, versiones y configuración.
- ✅ **Uso del enfoque Clean Architecture adaptado** — Separación clara entre lógica, interfaz y datos.
- ✅ **Compose-first** — Se prioriza el uso de tecnologías declarativas modernas recomendadas por Google.
- ✅ **Control total de dependencias** — Uso explícito y controlado de cada librería y versión mediante `libs.versions.toml`.

---

## 💡 Nivel técnico demostrado

El desarrollo de este proyecto refleja dominio en:

- Configuración profesional de entornos Android modernos.
- Aplicación disciplinada de flujos Git (GitHub Flow).
- Uso avanzado de Compose, modularización y prácticas de arquitectura limpia.
- Gestión precisa y documentada de dependencias y herramientas de build.

---

## 📦 Estructura del proyecto

```
SugarTracker/
├── app/ # Módulo principal
├── core/ # Utilidades, interfaces, modelos compartidos
├── feature-glucose-tracking/
├── feature-insulin-dosage/
├── feature-settings/
├── build.gradle.kts
├── settings.gradle.kts
└── libs.versions.toml
```


---

## 👣 Próximos pasos

- [ ] Persistencia local con Room.
- [ ] Registro y análisis de datos históricos.
- [ ] Interfaz personalizable para seguimiento diario.
- [ ] Exportación de reportes PDF o CSV.
- [ ] Integración con servicios de salud (Google Fit, etc.).

---

## 🤝 Colaboración

Este proyecto está en fase activa de desarrollo. Toda sugerencia técnica, prueba o mejora es bienvenida.

---

© 2025 — Proyecto desarrollado con fines profesionales y formativos.
