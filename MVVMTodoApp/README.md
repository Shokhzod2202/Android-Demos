# Learning MVVM Project

## Intorduction:

Use MVVM to give a projet a clear structure.

Devide the project to 3 layers:
 - UI                   (Display what the viewModel provides)
 - Business Logic       (Pure application logic. Ex: Search, Sort etc.)
 - Data                 (Local: Room, etc. Remote: API, ManogoDB, etc.)


|---data
|  |---Todo                 ( Entity: will contain all the fields that we want to save with a single Todo Item.)
|  |---TodoDao              ( Dao: Data Access Object. It is used to access our data. Defines how we access.)
|  |---TodoDatabase         ( Actual DB. Place where our Entities are stored.)
|  |---TodoRepository       ( Declaration of Repository. Repository accesses to all of our data sources(Remote, Local, Preferences). Decide which type of data to refer to the viewModel to display on View. )
|  |---TodoRepositoryImpl   ( Implementation of our Repository.)
|---di      `(Dependency Injection)`
|  |---AppModule            ( Provides Dependencies (like parent classes to children)
|
|---ui     *** ViewModel ***  `(UI events (user interactions with UI))`
|  |---add_edit_todo        ( )
|  |---theme                ( )
|  |---todo_list            ( )
|    |---TodoItem.kt        ( )
|    |---TodoListEvent      ( All the possible Events (UI actions.))
|    |---TodoListScreen.kt  ( )
|    |---TodoListViewModel  ( ViewModel stores the state of the ui (theme, etc). Controls the View.)
|
|---util
|  |---Routes
|  |---UiEvent
|
|---MainActivity
|---TodoApp

### dagger.hilt
    - Create a new class called `TodoApp` in your root package.
    TodoApp:
    ```
    package com.plcoding.mvvmtodoapp

    import android.app.Application
    import dagger.hilt.android.HiltAndroidApp

    @HiltAndroidApp
    class TodoApp: Application()
    ```

    Add name to your Manifest file:
    ```
        <!-- Add ->  android:name=".TodoApp"   -->
        <application
            android:name=".TodoApp"
            android:allowBackup="true"
            android:icon="@mipmap/ic_launcher"
    ```
