package com.andhiratobing.notecompose.di

import android.app.Application
import androidx.room.Room
import com.andhiratobing.notecompose.feature_note.data.datasource.NoteDatabase
import com.andhiratobing.notecompose.feature_note.data.datasource.NoteDatabase.Companion.DATABASE_NAME
import com.andhiratobing.notecompose.feature_note.data.repository.NoteRepositoryImpl
import com.andhiratobing.notecompose.feature_note.domain.repository.NoteRepository
import com.andhiratobing.notecompose.feature_note.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application): NoteDatabase {
        return Room.databaseBuilder(
            application,
            NoteDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(database: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(database.noteDao())
    }


    @Provides
    @Singleton
    fun provideNoteUseCases(noteRepository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            addNotes = AddNoteUseCase(noteRepository),
            getNotes = GetNotesUseCase(noteRepository),
            getNoteById = GetNoteByIdUseCase(noteRepository),
            deleteNote = DeleteNoteUseCase(noteRepository)
        )
    }

}