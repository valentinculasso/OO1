package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	/**
	 * Complete con su implementación
	 */
	private String texto = "Undefined post";
	private int likes = 0;
	private boolean featured = false;
	
	@Override
	public String getText() {
		return texto;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		texto = text;
	}

	@Override
	public int getLikes() {
		// TODO Auto-generated method stub
		return likes;
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		likes++;
	}

	@Override
	public void dislike() {
		// TODO Auto-generated method stub
		likes--;
	}

	@Override
	public boolean isFeatured() {
		// TODO Auto-generated method stub
		return featured;
	}

	@Override
	public void toggleFeatured() {
		// TODO Auto-generated method stub
		if(featured == false) {
			featured = true;
		}
		else {
			featured = false;
		}
	}
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
