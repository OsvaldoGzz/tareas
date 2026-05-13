# Bitacora de uso de IA - Proyecto Integrador GymPOS

## Introduccion

Durante el desarrollo del proyecto integrador GymPOS se utilizo inteligencia artificial como apoyo para resolver dudas tecnicas, organizar la arquitectura del sistema y mejorar la implementacion de diferentes funcionalidades.

La IA no genero automaticamente el proyecto completo, sino que se uso como herramienta de apoyo para investigar conceptos, ejemplos y formas de implementar caracteristicas especificas del sistema.

El proyecto fue adaptado y modificado manualmente para ajustarse a los requisitos del curso y al diseño elegido.

---

# Etapa 1 - Planeacion y arquitectura

## Prompt 1
Pregunte como organizar un proyecto Java grande con muchos modulos y funcionalidades.

## Respuesta de la IA
La IA sugirio usar una arquitectura separada por packages para mantener el codigo organizado y modular.

Tambien recomendo implementar MVC para separar:
- logica
- datos
- interfaz grafica

## Adaptacion realizada
Se creo la siguiente estructura:

gympos/
├── model
├── view
├── controller
├── service
├── persistence
├── exception
└── util

## Aprendizaje obtenido
Aprendi que dividir un sistema grande en modulos facilita:
- mantenimiento
- escalabilidad
- lectura del codigo

Tambien aprendi la diferencia entre:
- modelo
- vista
- controlador

---

# Etapa 2 - Modelado de clases

## Prompt 2
Pregunte como modelar clientes, membresias y productos usando POO.

## Respuesta de la IA
La IA sugirio:
- clases abstractas
- herencia
- encapsulamiento
- sobrescritura de metodos

## Adaptacion realizada
Se implementaron:
- Membresia abstracta
- MembresiaBasica
- MembresiaPremium
- MembresiaEstudiante

Tambien se agregaron:
- Cliente
- Producto
- RegistroAcceso
- ClaseGrupal

## Aprendizaje obtenido
Aprendi:
- cuando usar herencia
- como reutilizar codigo
- como usar clases abstractas

---

# Etapa 3 - Validaciones y excepciones

## Prompt 3
Pregunte como crear excepciones personalizadas para un sistema real.

## Respuesta de la IA
La IA explico como extender Exception y crear jerarquias de excepciones.

Tambien explico ventajas de separar errores por tipo.

## Adaptacion realizada
Se crearon:
- GymPOSException
- ClienteInvalidoException
- PagoRechazadoException
- MembresiaVencidaException

## Aprendizaje obtenido
Aprendi que las excepciones personalizadas ayudan a:
- identificar errores rapidamente
- mejorar mantenimiento
- hacer el codigo mas claro

---

# Etapa 4 - Persistencia y serializacion

## Prompt 4
Pregunte como guardar datos de clientes y productos en Java.

## Respuesta de la IA
La IA explico:
- Serializable
- ObjectOutputStream
- ObjectInputStream

## Adaptacion realizada
Se creo:
- DataStore.java

para guardar:
- clientes
- productos
- membresias
- accesos

## Aprendizaje obtenido
Aprendi:
- persistencia de objetos
- diferencia entre texto y binario
- manejo de archivos serializados

---

# Etapa 5 - Colecciones

## Prompt 5
Pregunte que colecciones eran mejores para un sistema de gimnasio.

## Respuesta de la IA
La IA recomendo:
- ArrayList para listas principales
- HashMap para busquedas por ID
- LinkedList para historiales
- HashSet para evitar repetidos

## Adaptacion realizada
Se utilizaron colecciones distintas dependiendo del tipo de dato.

## Aprendizaje obtenido
Aprendi que cada coleccion tiene ventajas distintas en rendimiento y organizacion.

---

# Etapa 6 - Multithreading

## Prompt 6
Pregunte como aplicar concurrencia en un proyecto real.

## Respuesta de la IA
La IA sugirio usar hilos para:
- reportes
- backups
- notificaciones

Tambien explico Runnable y Thread.

## Adaptacion realizada
Se implementaron:
- GeneradorReportes
- BackupService
- NotificadorMembresias

todos usando Runnable.

## Aprendizaje obtenido
Aprendi:
- ejecucion paralela
- tareas en segundo plano
- uso basico de hilos

---

# Etapa 7 - JavaFX y GUI

## Prompt 7
Pregunte como conectar JavaFX con un controlador MVC.

## Respuesta de la IA
La IA explico:
- TableView
- ObservableList
- eventos
- formularios CRUD

## Adaptacion realizada
Se desarrollo:
- GymPOSView
- GymController

con:
- tabla de clientes
- formulario
- botones CRUD
- eventos de mouse

## Aprendizaje obtenido
Aprendi:
- manejo de interfaces graficas
- eventos
- comunicacion entre vista y controlador

---

# Etapa 8 - Formularios y validacion

## Prompt 8
Pregunte como validar formularios en JavaFX.

## Respuesta de la IA
La IA sugirio validar:
- campos vacios
- datos incorrectos
- conversiones numericas

## Adaptacion realizada
Se agregaron validaciones antes de registrar clientes.

## Aprendizaje obtenido
Aprendi la importancia de validar entradas del usuario.

---

# Etapa 9 - Reportes y backups

## Prompt 9
Pregunte como generar reportes y backups automaticos.

## Respuesta de la IA
La IA sugirio:
- BufferedWriter
- timestamps
- hilos separados

## Adaptacion realizada
Se creo:
- reporte_gympos.txt
- backups automaticos con fecha

## Aprendizaje obtenido
Aprendi:
- escritura de archivos
- automatizacion basica
- uso de fechas en archivos

---

# Etapa 10 - Documentacion

## Prompt 10
Pregunte como estructurar documentacion tecnica y manuales.

## Respuesta de la IA
La IA recomendo separar:
- README
- manual tecnico
- manual usuario
- bitacora IA

## Adaptacion realizada
Se elaboraron documentos separados para explicar:
- arquitectura
- uso
- implementacion
- experiencia de desarrollo

## Aprendizaje obtenido
Aprendi la importancia de documentar correctamente un proyecto.

---

# Etapa 11 - Organizacion del proyecto

## Prompt 11
Pregunte como organizar correctamente los archivos del proyecto integrador.

## Respuesta de la IA
La IA explico que:
- src debe contener solo codigo
- la documentacion debe ir fuera de src
- los archivos generados deben ir en carpetas separadas

## Adaptacion realizada
Se organizaron:
- data
- reports
- backups
- config

y los archivos .md se colocaron en la raiz del proyecto.

## Aprendizaje obtenido
Aprendi una estructura mas profesional para proyectos Java.

---

# Etapa 12 - MVC y separacion de responsabilidades

## Prompt 12
Pregunte como separar correctamente la logica del sistema y la interfaz.

## Respuesta de la IA
La IA explico que:
- controller conecta vista y modelo
- service contiene la logica
- view solo muestra informacion

## Adaptacion realizada
Se separaron:
- GymController
- GymPOSView
- clases service

## Aprendizaje obtenido
Aprendi a evitar mezclar interfaz con logica del negocio.

---

# Conclusiones personales

La IA fue utilizada como una herramienta de apoyo tecnico y aprendizaje durante el desarrollo de GymPOS.

El uso de IA ayudo principalmente a:
- resolver dudas
- investigar conceptos
- mejorar organizacion
- acelerar implementaciones

Sin embargo, el proyecto requirio:
- adaptar codigo
- corregir errores
- reorganizar estructuras
- probar funcionalidades manualmente

El desarrollo del proyecto permitio integrar la mayoria de los conceptos vistos durante el semestre en una sola aplicacion.

Tambien ayudo a comprender mejor temas como:
- MVC
- JavaFX
- serializacion
- concurrencia
- colecciones
- manejo de excepciones
- persistencia de datos
- arquitectura de software

En general, la IA funciono como una herramienta de apoyo y consulta tecnica durante todo el proceso de desarrollo del proyecto integrador.