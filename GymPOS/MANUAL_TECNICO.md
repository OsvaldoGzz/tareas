# Manual Tecnico - GymPOS

## 1. Descripcion general

GymPOS es una aplicacion Java para la administracion basica de un gimnasio.

Integra conceptos de programacion orientada a objetos, JavaFX, manejo de archivos, serializacion, excepciones y concurrencia.

---

## 2. Arquitectura

El proyecto se organiza usando MVC.

### Model
Contiene las clases principales del dominio:

- Cliente
- Membresia
- MembresiaBasica
- MembresiaPremium
- MembresiaEstudiante
- Producto
- ClaseGrupal
- RegistroAcceso

### View
Contiene la interfaz grafica:

- GymPOSView

### Controller
Contiene la comunicacion entre vista y servicios:

- GymController

### Service
Contiene la logica del sistema:

- GestionClientes
- SistemaMembresias
- ProcesadorPagos
- ControlAcceso
- InventarioEquipos
- GeneradorReportes
- BackupService
- NotificadorMembresias

### Persistence
Contiene la persistencia:

- DataStore

### Exception
Contiene excepciones personalizadas:

- GymPOSException
- ClienteInvalidoException
- PagoRechazadoException
- MembresiaVencidaException

### Util
Contiene utilidades:

- Configuracion
- DatosPrueba

---

## 3. Diagrama UML general

```text
Cliente
Membresia <|-- MembresiaBasica
Membresia <|-- MembresiaPremium
Membresia <|-- MembresiaEstudiante

GestionClientes --> Cliente
SistemaMembresias --> Membresia
InventarioEquipos --> Producto
ControlAcceso --> RegistroAcceso
GymController --> GestionClientes
GymPOSView --> GymController
DataStore --> Cliente
DataStore --> Producto