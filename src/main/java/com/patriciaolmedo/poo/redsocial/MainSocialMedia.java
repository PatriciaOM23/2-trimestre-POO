package com.patriciaolmedo.poo.redsocial;

import java.util.ArrayList;
import java.util.Locale;

import com.github.javafaker.Faker;

public class MainSocialMedia {

	public static void main(String[] args) {

		// PRUEBA FAKER
		Faker faker = new Faker(Locale.forLanguageTag("es"));
		System.out.println(faker.beer().name());
		System.out.println(faker.name().firstName());

		ArrayList<Profile> profiles = new ArrayList<>();

		// Añadir perfiles directamente
		profiles.add(CreateProfile.profileTest());
		profiles.add(CreateProfile.profileTest());
		profiles.add(CreateProfile.profileTest());
		profiles.add(CreateProfile.profileWithPost(5));
		profiles.add(CreateProfile.profileWithPost(0));

		// ASIGNO CADA PERFIL A UN INDICE
		Profile profile1 = profiles.get(0);
		Profile profileWP2 = profiles.get(4);

		System.out.println("----------------\n PROFILE1\n -------------------\n");
		profile1.showInformation();
		profile1.showPosts();
		profile1.newFollower(1240);
		System.out.println("----------------\n PROFILE WITH POST 1\n -------------------\n");

		profileWP2.showInformation();
		profileWP2.showPosts();
		System.out.println("----------------\n AÑADO FOLLOWERS Y CREO UN POST\n -------------------\n");
		profileWP2.newFollower(10);
		profileWP2.createPost(faker.leagueOfLegends().summonerSpell());
		profileWP2.showInformation();
		profileWP2.showPosts();
		
		
		// CREAR PERFIL CON MUSTACHE
		Profile profileMustache = new Profile();
		profileMustache = CreateProfile.profileWithPost(3);
		RenderProfile.generarHtmlPerfil(profileMustache, "C:\\Users\\PatriciaOlmedoMajano\\OneDrive - SUMMA Formación Profesional\\Desktop\\profile_test.html");

		
		
		
		
		
		
		

	}

}
