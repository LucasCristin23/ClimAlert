# Proyecto

Backend desarrollado con Java 21 y Spring Boot.
Arquitectura por capas.
Las respuestas REST utilizan DTOs.
No exponer entidades directamente.

# Convenciones

- Controllers solo reciben requests.
- El service es el orquestador de casos de uso.
- La logica de negocio reside en el dominio. 
- Los Repositories solo acceden a la base.
- Utilizar constructor injection.

# Estilo
- Código limpio.
- Métodos cortos.
- Variables descriptivas.
- Evitar comentarios innecesarios.
- Seguir principios SOLID.
- Para los getters y setters usar lombok

# Antes de implementar cualquier cambio

Siempre seguí el siguiente proceso:

1. Analizá el proyecto completo y entendé cómo está organizada la funcionalidad relacionada.
2. Buscá implementaciones similares y reutilizá el código existente cuando sea posible.
3. Respetá la arquitectura, el estilo y las convenciones del proyecto.
4. Explicá detalladamente el plan de implementación antes de modificar archivos.
5. Identificá posibles riesgos o efectos secundarios.
6. SIEMPRE espera mi confirmacion antes de aplicar cualquier cambio.
7. Una vez terminada la implementación, revisá el código buscando errores, duplicación, problemas de rendimiento y posibles mejoras.

# Explicaciones

Cuando la implementación involucre una tecnología, patrón o concepto importante, explicá brevemente el motivo de la solución elegida para facilitar el aprendizaje. No des explicaciones innecesarias sobre conceptos básicos.