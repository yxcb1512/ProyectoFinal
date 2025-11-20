✈️ MANUAL DE USUARIO – Sistema de Reservación de Vuelos
📌 1. Introducción

Este programa permite realizar reservaciones de vuelos seleccionando un origen, un destino, la clase del asiento y los datos del pasajero.
Además, permite visualizar la factura del tiquete comprado y consultar la disponibilidad de asientos por cada ruta.

El sistema es sencillo y está diseñado para ser utilizado por cualquier persona sin conocimientos técnicos.

📌 2. Requisitos del sistema

Para poder ejecutar el programa se requiere:

Computadora con Windows, macOS o Linux.

Java instalado (versión 8 o superior).

Archivo ejecutable del programa o acceso al proyecto en NetBeans.

📌 3. Inicio del programa

Al abrir el sistema, aparecerá una ventana principal con los siguientes componentes:

Espacios para escribir información del pasajero:

Nombre
Identificación
Correo electrónico
Teléfono
Listas desplegables (combo box) para elegir:
Origen del vuelo
Destino del vuelo
Clase (Ejecutiva o Económica)

Botones:
Reservar (para generar el tiquete y factura).
Ver disponibilidad (para ver cuántos asientos quedan en esa ruta).
Cuadro de salida de texto donde se muestran los resultados.

📌 4. Cómo realizar una reservación

Siga los siguientes pasos:

✔ Paso 1: Ingresar los datos del pasajero

Escriba en los espacios correspondientes:
Nombre completo
Número de identificación
Correo electrónico
Debe contener @ obligatoriamente
Número de teléfono

Si falta alguno de estos datos, el sistema le mostrará una alerta y no permitirá continuar.


✔ Paso 2: Seleccionar la información del vuelo

Use las listas desplegables:
Seleccione el origen del vuelo (ejemplo: SJO).
Seleccione el destino del vuelo (ejemplo: LIO).
Seleccione la clase del asiento:
Ejecutiva
Económica

El sistema no permitirá reservar si el origen y el destino son iguales.


✔ Paso 3: Realizar la reservación

Presione el botón “Reservar”.
Si hay asientos disponibles:
Se generará un tiquete.
Se creará una factura.
Ambos se mostrarán en el cuadro de texto.

Si no hay espacios en la clase seleccionada:
Aparecerá un mensaje indicando que no hay asientos disponibles.


📌 5. Consultar disponibilidad de asientos

Antes de reservar un tiquete, puede ver cuántos asientos están libres en la ruta escogida:
✔ Paso 1:
Seleccione el origen y el destino.

✔ Paso 2:
Presione el botón “Ver disponibilidad”.

El sistema mostrará:
Asientos disponibles de Clase Ejecutiva
Asientos disponibles de Clase Económica

La disponibilidad se guarda por cada ruta.
Esto significa que los asientos para SJO → LIR son independientes de LIO → SJO, por ejemplo.

📌 6. Generación del tiquete y factura

Cuando hace una reservación exitosa, el sistema mostrará:

✈️ TIQUETE

Incluye:
Código del tiquete
Nombre del pasajero
Código del vuelo
Origen y destino
Clase
Precio
Fecha de emisión

🧾 FACTURA

Incluye:
Número de factura
Datos del cliente
Precio base
IVA (13%)
Total cancelado

Toda esta información aparece en la caja de texto de la parte inferior de la ventana.

📌 7. Mensajes y alertas del sistema

El sistema puede mostrar mensajes como:

“Debe llenar todos los campos obligatorios.”
“El correo debe contener un @.”
“El origen y el destino no pueden ser iguales.”
“ERROR: No hay asientos disponibles en [clase].”
Estos mensajes ayudan a corregir errores antes de completar una reservación.


📌 8. Cierre del programa

Para salir simplemente cierre la ventana principal usando la X.
