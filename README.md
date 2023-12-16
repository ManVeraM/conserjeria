### Clonar el repositorio

Para clonar el repositorio, puedes usar el siguiente comando en tu terminal:

```bash
git clone https://github.com/ManVeraM/conserjeria
```

Para crear las imagenes, debes usar el siguiente comando en tu terminal:

```bash
docker-compose up -d 
```

### Abrir DOCKERHUB DESKTOP

Abrir la seeccion de contenedores o ingresar en el navegador alguna de las siguientes direcciones:

```
http://localhost:7070/  para la conexion con sqlite
http://localhost:7071/  para la conexion con mariadb
```

### Direcciones

```
http://localhost:7070/ 
http://localhost:7070/api/personas
http://localhost:7070/persona/rut/{rut}
```
```
http://localhost:7071/ -> API
http://localhost:7071/personas/ -> GET ALL PERSONAS
http://localhost:7071/persona/rut/{rut} -> GET PERSONA BY RUT
```
