# Foodie Customer App

Aplicación para clientes de Foodie, un servicio de entrega de comida.

## Actualizaciones Recientes

- Se han actualizado todas las dependencias a las últimas versiones estables para mejorar el rendimiento, la seguridad y la compatibilidad.
- Se reemplazó el paquete obsoleto `progress_dialog_null_safe` por `sn_progress_dialog`.
- Se eliminó la dependencia explícita de `intl` para resolver conflictos de versiones, permitiendo que `flutter_localizations` la gestione.
- Se actualizaron los paquetes `http` y `uuid` a versiones más recientes.

## Despliegue con Codemagic

Este proyecto está configurado para ser compilado con Codemagic. El archivo de configuración `codemagic.yaml` se encuentra en la raíz del repositorio y contiene los pasos necesarios para construir los APKs de las tres aplicaciones (cliente, repartidor y restaurante).
