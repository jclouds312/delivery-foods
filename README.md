# Foodie Customer App

Aplicación para clientes de Foodie, un servicio de entrega de comida.

## Actualizaciones Recientes

- Se han actualizado todas las dependencias a las últimas versiones estables para mejorar el rendimiento, la seguridad y la compatibilidad.
- Se reemplazó el paquete obsoleto `progress_dialog_null_safe` por `sn_progress_dialog`.
- Se eliminó la dependencia explícita de `intl` para resolver conflictos de versiones, permitiendo que `flutter_localizations` la gestione.
- Se actualizaron los paquetes `http` y `uuid` a versiones más recientes.

## Despliegue con Codemagic

Este proyecto está configurado para ser compilado con Codemagic. El archivo de configuración `codemagic.yaml` se encuentra en la raíz del repositorio y contiene los pasos necesarios para construir los APKs de las tres aplicaciones (cliente, repartidor y restaurante).

## Actualización de Dependencias y Despliegue

Se han actualizado todas las dependencias del proyecto a sus últimas versiones compatibles para asegurar el correcto funcionamiento y la seguridad de la aplicación.

Para desplegar la aplicación utilizando Codemagic, sigue estos pasos:

1.  Asegúrate de que tu repositorio de Git esté conectado a tu cuenta de Codemagic.
2.  Configura un nuevo flujo de trabajo en Codemagic para este proyecto.
3.  Utiliza el archivo `codemagic.yaml` proporcionado en este repositorio como plantilla para tu configuración de compilación.
4.  Inicia una nueva compilación en Codemagic. La compilación generará los artefactos de la aplicación para Android (APK).

A continuación, se compilará la aplicación para generar los APKs.
