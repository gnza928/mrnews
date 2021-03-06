/*
 * @author Gonzalo Nieto Berríos
 */

package cl.ucn.disc.dsm.mrnews.services.mockup;

import cl.ucn.disc.dsm.mrnews.model.Noticia;
import cl.ucn.disc.dsm.mrnews.services.NoticiaService;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.ZonedDateTime;

public final class MockupNoticiaService implements NoticiaService {
  /**
   * Constructor.
   */
  public MockupNoticiaService() {
  }

  /**
   * Get the Noticias from the backend.
   *
   * @param pageSize how many.
   * @return the {@link List} of {@link Noticia}.
   */
  @Override
  public List<Noticia> getNoticias(int pageSize) {

    final List<Noticia> noticias = new ArrayList<>();

    noticias.add(new Noticia(
        1L,
        "Primer Titulo",
        "Primera Fuente",
        "Primer Autor",
        "http://primero.cl",
        "http://primero.cl/primero.jpg",
        "Primer Resumen",
        "Primer Contenido",
        ZonedDateTime.now())
    );

    noticias.add(new Noticia(
        2L,
        "Segundo Titulo",
        "Segunda Fuente",
        "Segundo Autor",
        "http://segundo.cl",
        "http://segundo.cl/segundo.jpg",
        "Segundo Resumen",
        "Segundo Contenido",
        ZonedDateTime.now())
    );

    return noticias;

  }

  @Override
  public List<Noticia> getTopHeadLines (int pageSize) {
    return null;
  }
}
