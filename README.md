# LAB 18 : ViewModel et LiveData en Android

## 📌 Objectif du LAB

Ce laboratoire a pour objectif de comprendre :

- Le problème de perte de données lors de la rotation d’écran.
- Le fonctionnement de `ViewModel`.
- L’utilisation de `LiveData`.
- La mise à jour automatique de l’interface utilisateur.
- L’architecture MVVM en Android.

---

# 🛠 Technologies utilisées

- Android Studio
- Java
- Android Jetpack
- ViewModel
- LiveData

---

# 📂 Création du projet

- **Nom du projet :** `ViewModelLiveDataDemoEnrichi`
- **Langage :** Java
- **Minimum SDK :** API 24

---

# 📦 Dépendances ajoutées

Dans `build.gradle.kts` :

```kotlin
val lifecycle_version = "2.10.0"

implementation("androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version")
implementation("androidx.lifecycle:lifecycle-livedata:$lifecycle_version")
```

---

# 🖥 Interface utilisateur

Le layout contient :

- Un `TextView` pour afficher le compteur.
- Un bouton **INCRÉMENTER**
- Un bouton **DÉCRÉMENTER**
- Un bouton **RÉINITIALISER**

---


---

# 🧪 Résultat obtenu

- Le compteur fonctionne correctement.
- Les données restent sauvegardées après rotation de l’écran.
- L’interface est automatiquement mise à jour grâce à LiveData.

---

# 📸 Capture d’écran


---<img width="312" height="582" alt="36" src="https://github.com/user-attachments/assets/a29d6cba-55ce-4ce8-8a5c-4b335284afef" />


# ✅ Conclusion

Dans ce LAB, nous avons appris à utiliser :

- `ViewModel`
- `LiveData`
- `MutableLiveData`
- `Observer`
- Architecture MVVM

Cette approche permet de créer des applications Android modernes, robustes et résistantes aux changements de configuration comme la rotation d’écran.
