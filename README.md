# Sistema de Facturación en Java

## Descripción
Sistema de facturación desarrollado en Java que permite gestionar clientes, calcular ventas con IVA, aplicar descuentos opcionales y generar facturas detalladas con información completa del cliente y la transacción.

## Características del Proyecto

### Funcionalidades Base
- Cálculo de ventas con IVA (19%)
- Gestión de precios y cantidades
- Visualización de factura formateada

### Aportes Creativos Implementados

#### 1. **Clase Cliente**
Se implementó una clase `Cliente` completa con los siguientes atributos:
- Nombre
- ID de cliente
- Número telefónico
- Correo electrónico

Esta clase incluye:
- Constructor por defecto y parametrizado
- Getters y setters para todos los atributos
- Encapsulamiento adecuado de datos

#### 2. **Sistema de Descuentos Opcional**
- Pregunta interactiva al usuario si desea aplicar descuento
- Permite ingresar el porcentaje de descuento deseado
- Cálculo automático del monto descontado
- Muestra el descuento aplicado en la factura solo si se utilizó

#### 3. **Número de Factura Aleatorio**
- Generación de número de factura único usando la clase `Random`
- Rango de números entre 0 y 99
- Simulación de un sistema real de numeración de facturas

#### 4. **Información de Fecha y Hora**
- Captura automática de fecha y hora al momento de crear la factura
- Formato de fecha: `dd/MM/yyyy`
- Formato de hora: `HH:mm`
- Uso de `LocalDateTime` para precisión temporal

#### 5. **Factura Detallada**
La factura muestra información completa:
- Número de factura
- Fecha y hora de emisión
- Datos completos del cliente (nombre, ID, teléfono, email)
- Detalle de la compra (cantidad y precio unitario)
- Descuento aplicado (si corresponde)
- Total a pagar

## Estructura del Proyecto

```
ejercicio1/
│
├── Cliente.java       # Clase para gestión de datos del cliente
├── Factura.java       # Clase para cálculo y gestión de facturas
└── Ejercicio1.java    # Clase principal con interfaz de usuario
```

## Clases

### Cliente.java
Gestiona la información personal del cliente con atributos privados y métodos de acceso.

### Factura.java
Maneja todos los cálculos relacionados con la venta:
- Cálculo de subtotal
- Aplicación de descuentos
- Cálculo de IVA
- Total final
- Fecha y hora de la transacción

### Ejercicio1.java
Clase principal que:
- Solicita datos al usuario
- Crea instancias de Cliente y Factura
- Gestiona la opción de descuentos
- Muestra la factura formateada

## Requisitos
- Java JDK 8 o superior
- Biblioteca IO para entrada/salida (incluida en el proyecto)

## Cómo Ejecutar
1. Compilar todos los archivos .java
2. Ejecutar la clase `Ejercicio1`
3. Seguir las instrucciones en pantalla:
   - Ingresar datos del cliente
   - Ingresar cantidad y precio del artículo
   - Elegir si aplicar descuento
   - Ver la factura generada

## Ejemplo de Salida
```
-------FACTURA------
Numero de Factura: 42
Fecha: 27/11/2025
Hora: 14:30
--------------------
Nombre: Victor Cordoba
Id: 1232591140
Telefono: 3506037128
Email: cordobavictorml@gmail.com
--------------------
Datos de su compra:
Cantidad: 3
Precio unitario: 7000.0
Descuento (5.0%): 1050.0
El total de la factura es: 23740.0
-------TENGA BUEN DIA------
```

## Mejoras Implementadas vs. Código Base
- ✅ Clase Cliente creada para mejor organización
- ✅ Sistema de descuentos interactivo y opcional
- ✅ Generación de número de factura aleatorio
- ✅ Información temporal (fecha y hora) automática
- ✅ Factura más profesional con todos los datos del cliente
- ✅ Mejor experiencia de usuario con mensajes claros

## Autor ✒️
* **Victor Cordoba** - *Creador y desarrollador principal* - [VoctorX](https://github.com/VoctorX)

## Fecha
* 27 de Noviembre del 2025, Programacion Orientada a Objetos

## Licencia
Proyecto académico - Uso educativo
