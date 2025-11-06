# Foodies Restaurant App

Aplicación para restaurantes asociados con Foodie, un servicio de entrega de comida.

## Actualizaciones Recientes

- Se han actualizado todas las dependencias a las últimas versiones estables para mejorar el rendimiento, la seguridad y la compatibilidad.
- Se reemplazó el paquete obsoleto `progress_dialog_null_safe` por `sn_progress_dialog`.
- Se eliminó la dependencia explícita de `intl` para resolver conflictos de versiones.
- Se reemplazó `place_picker` por `google_maps_place_picker_mb`.
- Se actualizaron los paquetes `http`, `uuid`, `image`, `esc_pos_utils`, `audioplayers` y `mailer` a versiones más recientes.

## Despliegue con Codemagic

Este proyecto está configurado para ser compilado con Codemagic. El archivo de configuración `codemagic.yaml` se encuentra en la raíz del repositorio y contiene los pasos necesarios para construir los APKs de las tres aplicaciones (cliente, repartidor y restaurante).
