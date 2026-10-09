# Void Dragons (addon de Ice and Fire) - Minecraft 1.20.1 / Forge 47.3.0

Proyecto base: Dragon del Vacio con loot, herramientas y armadura.

## Contenido actual
- Entidad `void_dragon` (terrestre, ataque con Wither, 120 de vida) con loot table y spawn en biomas del End
- Items: escama, lingote, sangre, hueso, huevo generador
- Herramientas: espada, pico, hacha, pala, azada (tier propio)
- Armadura de 4 piezas; el set completo da inmunidad al Wither
- Recetas (fundir escama en horno/alto horno, craftear herramientas y armadura)
- Idiomas: en_us y es_es
- Texturas y renderer PROVISIONALES (modelo de vaca escalado)

## Como compilar
1. Copia `gradlew`, `gradlew.bat` y la carpeta `gradle/wrapper` desde el MDK de Forge 1.20.1 (47.3.0).
2. Java 17.
3. `./gradlew build` genera el jar en `build/libs/`.
4. Para probar en juego: pon el jar junto con Ice and Fire y Citadel en la carpeta mods de un perfil Forge 1.20.1.

## Pendiente (siguientes fases)
- Extender `EntityDragonBase` de Ice and Fire: vuelo, etapas de crecimiento, huevo, domesticacion, montura
- Aliento del vacio (proyectil con Wither/Levitacion)
- Modelo y animaciones propias (GeckoLib) y texturas definitivas
- Texturas de armadura y de items reales (ahora son placeholders morados)
- Descomentar la dependencia de Ice and Fire en `build.gradle` (poner el FILE_ID real)
- Revisar la licencia de Ice and Fire antes de publicar el addon
