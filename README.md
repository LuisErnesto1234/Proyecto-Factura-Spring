# Proyecto de Facturación en Spring Boot

## Descripción
Este proyecto es una aplicación de facturación desarrollada con **Spring Boot**. Implementa clases esenciales como `Cliente`, `Factura`, `Producto` e `ItemsProducto`. Además, hace uso de controladores, inyección de dependencias y distintas anotaciones de alcance como `@RequestScope` y `@SessionScope`.

## Tecnologías Utilizadas
- **Java 17+**
- **Spring Boot 3.3.5**
- **Maven** (Gestor de dependencias)
- **IntelliJ IDEA** (IDE de desarrollo)

## Estructura del Proyecto
```
/src/main/java/com/tuempresa/facturacion
│── controller/        # Controladores de la aplicación
│── model/             # Clases de modelo (Cliente, Factura, Producto, ItemsProducto)
│── service/           # Servicios para la lógica de negocio
│── config/            # Configuraciones adicionales de Spring Boot
│── FacturacionApplication.java # Clase principal de la aplicación
```

## Instalación y Configuración
1. Clona el repositorio:
   ```sh
   git clone https://github.com/tuusuario/proyecto-factura.git
   cd proyecto-factura
   ```
2. Asegúrate de tener **Java 17+** y **Maven** instalados.
3. Compila y ejecuta la aplicación:
   ```sh
   mvn spring-boot:run
   ```

## Endpoints Principales
| Método | Endpoint           | Descripción |
|--------|--------------------|-------------|
| GET    | `/clientes`        | Lista todos los clientes |
| GET    | `/facturas`        | Lista todas las facturas |
| POST   | `/facturas`        | Crea una nueva factura |
| GET    | `/productos`       | Lista todos los productos |

## Características Implementadas
- Inyección de dependencias con `@Autowired`
- Uso de `@RequestScope` y `@SessionScope` para gestionar el estado de los beans
- Configuración con `application.properties`
- Controladores REST con `@RestController`

## Contribución
Si deseas contribuir al proyecto, puedes hacer un **fork**, crear una rama con tus cambios y enviar un **pull request**.

## Licencia
Este proyecto está bajo la licencia **MIT**.

---
¡Gracias por revisar este repositorio! 🚀

