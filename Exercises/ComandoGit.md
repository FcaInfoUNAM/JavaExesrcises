# Ubicarte en la raíz (si estás dentro de Exercises/)
cd /workspaces/JavaExesrcises

# 1. Ver que tienes los 8 archivos en su carpeta
ls Exercises

# 2. Cada clase pública en su propio archivo (cada línea debe terminar en :1)
grep -c "public class" Exercises/*.java

# 3. Compilar y ejecutar con la carpeta out (debe imprimir true)
rm -rf out
mkdir out
javac -d out Exercises/*.java Tests.java
java -cp out Tests

# 4. Comprobar que Tests.java no fue modificado (no debe aparecer en la lista)
git status

# 5. Guardar el trabajo (solo los .java, sin ComandoGit.md)
git add Exercises/*.java
git commit -m "Implementa DataTypes"
git push