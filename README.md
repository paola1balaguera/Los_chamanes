
# README: Proyecto Integrador 

## Descripción General

Este proyecto, desarrollado por **Paola Andrea Balaguera Vera**, **Anderson Esneyder Rodríguez Mantilla**, y **Jubal Gustavo Rojas Vega**, propone una solución digital para optimizar la gestión operativa de **Pepe Constructions S.A.S.**, una empresa constructora con sede en Bogotá, Colombia. La aplicación desarrollada es un software de escritorio enfocado en la gestión de pagos, ventas y otras operaciones administrativas.

### Contexto
La constructora enfrenta desafíos en la gestión manual de datos, como errores humanos, lentitud en la retroalimentación y problemas de escalabilidad en el almacenamiento. El proyecto busca solucionar estos problemas mediante la implementación de un sistema basado en la arquitectura **MVC (Modelo-Vista-Controlador)**.

---

## Objetivos

### Objetivo General
Desarrollar una aplicación de escritorio para gestionar pagos y ventas de propiedades en Pepe Constructions S.A.S.

### Objetivos Específicos
1. **Recolección de Requerimientos**:
   - Identificar requerimientos funcionales y no funcionales.
   - Precisar necesidades en la gestión de ventas y pagos.

2. **Diseño del Software**:
   - Utilizar UML para modelar el sistema.
   - Crear un modelo relacional de base de datos y diccionario de datos.

3. **Desarrollo del Software**:
   - Implementar la solución usando el patrón arquitectónico **MVC**.
   - Incluir módulos específicos para gestionar pagos y ventas.

---

## Alcance y Funcionalidades

1. **Gestión de Proyectos, Torres y Propiedades**:
   - Almacenar información estructurada de proyectos, torres y propiedades.
   - Generar códigos únicos para cada elemento.

2. **Gestión de Ventas y Pagos**:
   - Registrar ventas, pagos, y abonos.
   - Calcular deudas e intereses automáticamente.

3. **Roles y Privilegios**:
   - Soporte para roles: Super Admin, Administrador y Asesor.
   - Control de acceso y visualización según el rol.

4. **Generación de Reportes**:
   - Informes detallados sobre ventas, pagos y ocupación de propiedades.

5. **Gestión de Clientes y Personal**:
   - Registro de datos de clientes y empleados.
   - Soporte para subsidios gubernamentales.

6. **Disponibilidad 24/7**:
   - Acceso continuo para los usuarios.

---

## Diseño del Sistema

1. **Modelo UML**:
   - Diagrama de Casos de Uso y Diagrama de Clases.
   - Uso de patrones como Repository para el acceso a datos.

2. **Base de Datos**:
   - Modelo Entidad-Relación.
   - Modelo Relacional.
   - Diccionario de Datos.

3. **Arquitectura MVC**:
   - **Model**: Representación de datos y lógica del negocio.
   - **View**: Interfaces divididas según roles.
   - **Controller**: Intermediario entre modelos y vistas.

---

## Requisitos

### Funcionales
- Gestión de proyectos, torres, propiedades, ventas, pagos y clientes.
- Generación de reportes.
- Aplicación de subsidios y cálculo de intereses.

### No Funcionales
- Exclusividad para proyectos en Bogotá.
- Interfaz optimizada como software de escritorio.
- Acceso controlado según roles.

---

## Prototipo y Documentación

1. **Código Fuente**:
   Disponible en GitHub: [Los Chamanes](https://github.com/paola1balaguera/Los_chamanes/tree/main).

2. **Prototipo Funcional**:
   Incluye el 50% de los casos de uso propuestos.

3. **Pruebas**:
   CRUD implementado para operaciones en la base de datos.

4. **Documentación UML**:
   Diagrama de Clases y de Secuencia.

---

## Referencias

- Pressman, Ingeniería del Software: Un enfoque práctico.
- SENN, James A., Análisis y Diseño de Sistemas de Información, McGraw Hill.
- PONS, Olga, Introducción a los Sistemas de Bases de Datos.
- PIATTINI, Mario, Tecnología y Diseño de Bases de Datos.
- PÉREZ, César, Oracle 10g - Administración y Análisis de Bases de Datos.

---

Este README brinda una visión completa del propósito, estructura y funcionalidad del proyecto para su fácil comprensión y despliegue.
